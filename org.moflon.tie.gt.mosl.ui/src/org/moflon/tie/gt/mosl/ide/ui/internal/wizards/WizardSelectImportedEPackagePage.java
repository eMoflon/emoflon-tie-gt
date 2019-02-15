package org.moflon.tie.gt.mosl.ide.ui.internal.wizards;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.xtext.ui.util.IJdtHelper;
import org.eclipse.xtext.xtext.ui.wizard.ecore2xtext.Messages;
import org.eclipse.xtext.xtext.wizard.EPackageInfo;

import com.google.common.collect.Iterables;

/**
 * @author Jan Koehnlein - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class WizardSelectImportedEPackagePage extends WizardPage {

	private final Set<EPackageInfo> ePackageInfos = new HashSet<>();

	private EPackageInfo defaultEPackageInfo;

	private TableViewer importedEPackagesViewer;

	private final IJdtHelper jdtHelper;

	private final List<EPackage> selectedPackages;

	public WizardSelectImportedEPackagePage(final String pageName, final IStructuredSelection selection,
			final IJdtHelper jdtHelper) {
		super(pageName);
		this.jdtHelper = jdtHelper;
		selectedPackages = new ArrayList<>();
		setTitle("Select EPackages for Import");
		setDescription("Select all imports you need for the file");
	}

	private void addToSelectedtEPackages(final Object object) {
		if (object instanceof EPackageInfo) {
			selectedPackages.add(EPackageInfo.class.cast(object).getEPackage());
		}
	}

	@Override
	public void createControl(final Composite parent) {
		final Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		final Label label = new Label(composite, SWT.NONE);
		label.setText(Messages.WizardSelectImportedEPackagePage_ListTitle);
		label.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 2, 1));
		importedEPackagesViewer = new TableViewer(composite, SWT.BORDER);
		importedEPackagesViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 3));
		importedEPackagesViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@SuppressWarnings("unchecked")
			@Override
			public void selectionChanged(final SelectionChangedEvent event) {
				final ISelection iSelection = event.getSelection();
				if (iSelection instanceof StructuredSelection) {
					selectedPackages.clear();
					StructuredSelection.class.cast(iSelection).iterator()
							.forEachRemaining(obj -> addToSelectedtEPackages(obj));
				}

				updateUI();
			}
		});
		importedEPackagesViewer.setContentProvider(new IStructuredContentProvider() {
			@Override
			public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
			}

			@Override
			public void dispose() {
			}

			@Override
			public Object[] getElements(final Object inputElement) {
				return Iterables.toArray(ePackageInfos, EPackageInfo.class);
			}
		});
		importedEPackagesViewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(final Object element) {
				if (element instanceof EPackageInfo) {
					final String label = ((EPackageInfo) element).getEPackageJavaFQN();
					if (element == getDefaultEPackageInfo()) {
						return label + Messages.WizardSelectImportedEPackagePage_DefaultMarker;
					} else {
						return label;
					}
				}
				return element.toString();
			}
		});
		final Button addButton = new Button(composite, SWT.PUSH);
		addButton.setText(Messages.WizardSelectImportedEPackagePage_AddButtonText);
		addButton.setLayoutData(new GridData(SWT.FILL, SWT.BOTTOM, false, false, 1, 1));
		addButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				addEPackageInfos(new EPackageChooser(getShell(), jdtHelper).open());
			}
		});
		final Button defaultButton = new Button(composite, SWT.PUSH);
		defaultButton.setText(Messages.WizardSelectImportedEPackagePage_SetDefault);
		defaultButton.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		defaultButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				final ISelection selection = importedEPackagesViewer.getSelection();
				if (selection instanceof IStructuredSelection) {
					final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
					if (structuredSelection.size() == 1) {
						final Object firstElement = structuredSelection.getFirstElement();
						if (firstElement instanceof EPackageInfo) {
							defaultEPackageInfo = (EPackageInfo) firstElement;
						}
					}
				}
				updateUI();
			}
		});
		final Button removeButton = new Button(composite, SWT.PUSH);
		removeButton.setText(Messages.WizardSelectImportedEPackagePage_RemoveButtonText);
		removeButton.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		removeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				final ISelection selection = importedEPackagesViewer.getSelection();
				if (selection instanceof IStructuredSelection) {
					for (final Iterator<?> i = ((IStructuredSelection) selection).iterator(); i.hasNext();) {
						final Object ePackageInfo = i.next();
						ePackageInfos.remove(ePackageInfo);
						if (defaultEPackageInfo == ePackageInfo) {
							defaultEPackageInfo = null;
						}
					}
				}
				updateUI();
			}
		});

		final GridData layoutData = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		layoutData.heightHint = 20;

		updateUI();
		setControl(composite);
		Dialog.applyDialogFont(getControl());
	}

	public java.util.Collection<EPackageInfo> getEPackageInfos() {
		return ePackageInfos;
	}

	private void addEPackageInfos(final List<EPackageInfo> newEPackageInfos) {
		for (final Iterator<EPackageInfo> i = newEPackageInfos.iterator(); i.hasNext();) {
			final EPackage newEPackage = i.next().getEPackage();
			for (final EPackageInfo ePackageInfo : ePackageInfos) {
				final EPackage ePackage = ePackageInfo.getEPackage();
				if (ePackage.getNsURI().equals(newEPackage.getNsURI())) {
					i.remove();
					break;
				}
			}
		}
		ePackageInfos.addAll(newEPackageInfos);
		updateUI();
	}

	private void updateUI() {
		importedEPackagesViewer.setInput(ePackageInfos);
		importedEPackagesViewer.refresh();
		validatePage();
	}

	private void validatePage() {
		setPageComplete(!ePackageInfos.isEmpty() && !selectedPackages.isEmpty());
	}

	public List<EPackage> getSelectedPackages() {
		return selectedPackages;
	}

	public EPackageInfo getDefaultEPackageInfo() {
		if (defaultEPackageInfo == null && !ePackageInfos.isEmpty()) {
			defaultEPackageInfo = ePackageInfos.iterator().next();
		}
		return defaultEPackageInfo;
	}
}
