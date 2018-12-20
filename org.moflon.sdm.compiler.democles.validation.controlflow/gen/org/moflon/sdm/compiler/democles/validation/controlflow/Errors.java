/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Errors</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getErrors()
 * @model
 * @generated
 */
public enum Errors implements Enumerator {
   /**
    * The '<em><b>LOOP CROSSING EDGE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #LOOP_CROSSING_EDGE_VALUE
    * @generated
    * @ordered
    */
   LOOP_CROSSING_EDGE(26, "LOOP_CROSSING_EDGE", "LOOP_CROSSING_EDGE"),

   /**
    * The '<em><b>EXACTLY ONE START NODE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #EXACTLY_ONE_START_NODE_VALUE
    * @generated
    * @ordered
    */
   EXACTLY_ONE_START_NODE(0, "EXACTLY_ONE_START_NODE", "EXACTLY_ONE_START_NODE"),

   /**
    * The '<em><b>AT LEAST ONE STOP NODE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #AT_LEAST_ONE_STOP_NODE_VALUE
    * @generated
    * @ordered
    */
   AT_LEAST_ONE_STOP_NODE(1, "AT_LEAST_ONE_STOP_NODE", "AT_LEAST_ONE_STOP_NODE"),

   /**
    * The '<em><b>NO OUTGOING EDGE FROM STOP NODE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #NO_OUTGOING_EDGE_FROM_STOP_NODE_VALUE
    * @generated
    * @ordered
    */
   NO_OUTGOING_EDGE_FROM_STOP_NODE(2, "NO_OUTGOING_EDGE_FROM_STOP_NODE", "NO_OUTGOING_EDGE_FROM_STOP_NODE"),

   /**
    * The '<em><b>ACTIVITY EDGE END NODES IN SAME ACTIVITY</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #ACTIVITY_EDGE_END_NODES_IN_SAME_ACTIVITY_VALUE
    * @generated
    * @ordered
    */
   ACTIVITY_EDGE_END_NODES_IN_SAME_ACTIVITY(3, "ACTIVITY_EDGE_END_NODES_IN_SAME_ACTIVITY", "ACTIVITY_EDGE_END_NODES_IN_SAME_ACTIVITY"),

   /**
    * The '<em><b>FOR EACH EDGE FORWARD</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #FOR_EACH_EDGE_FORWARD_VALUE
    * @generated
    * @ordered
    */
   FOR_EACH_EDGE_FORWARD(4, "FOR_EACH_EDGE_FORWARD", "FOR_EACH_EDGE_FORWARD"),

   /**
    * The '<em><b>ONE EDGE BACK FROM FOREACH COMPONENT</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #ONE_EDGE_BACK_FROM_FOREACH_COMPONENT_VALUE
    * @generated
    * @ordered
    */
   ONE_EDGE_BACK_FROM_FOREACH_COMPONENT(5, "ONE_EDGE_BACK_FROM_FOREACH_COMPONENT", "ONE_EDGE_BACK_FROM_FOREACH_COMPONENT"),

   /**
    * The '<em><b>NO EDGE OUT OF FOREACH COMPONENT</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #NO_EDGE_OUT_OF_FOREACH_COMPONENT_VALUE
    * @generated
    * @ordered
    */
   NO_EDGE_OUT_OF_FOREACH_COMPONENT(6, "NO_EDGE_OUT_OF_FOREACH_COMPONENT", "NO_EDGE_OUT_OF_FOREACH_COMPONENT"),

   /**
    * The '<em><b>NO STOP NODE IN FOREACH COMPONENT</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #NO_STOP_NODE_IN_FOREACH_COMPONENT_VALUE
    * @generated
    * @ordered
    */
   NO_STOP_NODE_IN_FOREACH_COMPONENT(7, "NO_STOP_NODE_IN_FOREACH_COMPONENT", "NO_STOP_NODE_IN_FOREACH_COMPONENT"),

   /**
    * The '<em><b>NODE HAS TO HAVE OUTGOING EDGE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #NODE_HAS_TO_HAVE_OUTGOING_EDGE_VALUE
    * @generated
    * @ordered
    */
   NODE_HAS_TO_HAVE_OUTGOING_EDGE(8, "NODE_HAS_TO_HAVE_OUTGOING_EDGE", "NODE_HAS_TO_HAVE_OUTGOING_EDGE"),

   /**
    * The '<em><b>MAX TWO OUTGOING EDGES</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #MAX_TWO_OUTGOING_EDGES_VALUE
    * @generated
    * @ordered
    */
   MAX_TWO_OUTGOING_EDGES(9, "MAX_TWO_OUTGOING_EDGES", "MAX_TWO_OUTGOING_EDGES"),

   /**
    * The '<em><b>NO INCOMING EDGE INTO START NODE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #NO_INCOMING_EDGE_INTO_START_NODE_VALUE
    * @generated
    * @ordered
    */
   NO_INCOMING_EDGE_INTO_START_NODE(10, "NO_INCOMING_EDGE_INTO_START_NODE", "NO_INCOMING_EDGE_INTO_START_NODE"),

   /**
    * The '<em><b>ONE OUTGOING EDGE FROM START NODE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #ONE_OUTGOING_EDGE_FROM_START_NODE_VALUE
    * @generated
    * @ordered
    */
   ONE_OUTGOING_EDGE_FROM_START_NODE(11, "ONE_OUTGOING_EDGE_FROM_START_NODE", "ONE_OUTGOING_EDGE_FROM_START_NODE"),

   /**
    * The '<em><b>ONLY ONE EACH TIME EDGE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #ONLY_ONE_EACH_TIME_EDGE_VALUE
    * @generated
    * @ordered
    */
   ONLY_ONE_EACH_TIME_EDGE(12, "ONLY_ONE_EACH_TIME_EDGE", "ONLY_ONE_EACH_TIME_EDGE"),

   /**
    * The '<em><b>FOR EACH FALSE OUTGOING EDGE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #FOR_EACH_FALSE_OUTGOING_EDGE_VALUE
    * @generated
    * @ordered
    */
   FOR_EACH_FALSE_OUTGOING_EDGE(13, "FOR_EACH_FALSE_OUTGOING_EDGE", "FOR_EACH_FALSE_OUTGOING_EDGE"),

   /**
    * The '<em><b>FOR EACH NODE HAS EXACTLY ONE END EDGE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #FOR_EACH_NODE_HAS_EXACTLY_ONE_END_EDGE_VALUE
    * @generated
    * @ordered
    */
   FOR_EACH_NODE_HAS_EXACTLY_ONE_END_EDGE(14, "FOR_EACH_NODE_HAS_EXACTLY_ONE_END_EDGE", "FOR_EACH_NODE_HAS_EXACTLY_ONE_END_EDGE"),

   /**
    * The '<em><b>INVALID OUTGOING EDGES</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #INVALID_OUTGOING_EDGES_VALUE
    * @generated
    * @ordered
    */
   INVALID_OUTGOING_EDGES(15, "INVALID_OUTGOING_EDGES", "INVALID_OUTGOING_EDGES"),

   /**
    * The '<em><b>EMBEDDED LOOP FOUND</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #EMBEDDED_LOOP_FOUND_VALUE
    * @generated
    * @ordered
    */
   EMBEDDED_LOOP_FOUND(16, "EMBEDDED_LOOP_FOUND", "EMBEDDED_LOOP_FOUND"),

   /**
    * The '<em><b>HEAD LOOP EXT BWD EDGE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #HEAD_LOOP_EXT_BWD_EDGE_VALUE
    * @generated
    * @ordered
    */
   HEAD_LOOP_EXT_BWD_EDGE(17, "HEAD_LOOP_EXT_BWD_EDGE", "HEAD_LOOP_EXT_BWD_EDGE"),

   /**
    * The '<em><b>SECOND OUT EDGE INVALID</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #SECOND_OUT_EDGE_INVALID_VALUE
    * @generated
    * @ordered
    */
   SECOND_OUT_EDGE_INVALID(18, "SECOND_OUT_EDGE_INVALID", "SECOND_OUT_EDGE_INVALID"),

   /**
    * The '<em><b>IFTHEN ONLY ONE JOIN NODE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #IFTHEN_ONLY_ONE_JOIN_NODE_VALUE
    * @generated
    * @ordered
    */
   IFTHEN_ONLY_ONE_JOIN_NODE(19, "IFTHEN_ONLY_ONE_JOIN_NODE", "IFTHEN_ONLY_ONE_JOIN_NODE"),

   /**
    * The '<em><b>BOTH BRANCHES HEAD CONTROLLED</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #BOTH_BRANCHES_HEAD_CONTROLLED_VALUE
    * @generated
    * @ordered
    */
   BOTH_BRANCHES_HEAD_CONTROLLED(20, "BOTH_BRANCHES_HEAD_CONTROLLED", "BOTH_BRANCHES_HEAD_CONTROLLED"),

   /**
    * The '<em><b>BOTH BRANCHES TAIL CONTROLLED</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #BOTH_BRANCHES_TAIL_CONTROLLED_VALUE
    * @generated
    * @ordered
    */
   BOTH_BRANCHES_TAIL_CONTROLLED(21, "BOTH_BRANCHES_TAIL_CONTROLLED", "BOTH_BRANCHES_TAIL_CONTROLLED"),

   /**
    * The '<em><b>FOREACH END EDGE ERROR</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #FOREACH_END_EDGE_ERROR_VALUE
    * @generated
    * @ordered
    */
   FOREACH_END_EDGE_ERROR(22, "FOREACH_END_EDGE_ERROR", "FOREACH_END_EDGE_ERROR"),

   /**
    * The '<em><b>EDGE TARGET UNKNOWN TYPE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #EDGE_TARGET_UNKNOWN_TYPE_VALUE
    * @generated
    * @ordered
    */
   EDGE_TARGET_UNKNOWN_TYPE(23, "EDGE_TARGET_UNKNOWN_TYPE", "EDGE_TARGET_UNKNOWN_TYPE"),

   /**
    * The '<em><b>LOOP EXTERN EDGE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #LOOP_EXTERN_EDGE_VALUE
    * @generated
    * @ordered
    */
   LOOP_EXTERN_EDGE(24, "LOOP_EXTERN_EDGE", "LOOP_EXTERN_EDGE"),

   /**
    * The '<em><b>THEN ELSE BRANCH INVALID LOOP CONTAINMENT</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #THEN_ELSE_BRANCH_INVALID_LOOP_CONTAINMENT_VALUE
    * @generated
    * @ordered
    */
   THEN_ELSE_BRANCH_INVALID_LOOP_CONTAINMENT(25, "THEN_ELSE_BRANCH_INVALID_LOOP_CONTAINMENT", "THEN_ELSE_BRANCH_INVALID_LOOP_CONTAINMENT");

   /**
    * The '<em><b>LOOP CROSSING EDGE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>LOOP CROSSING EDGE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #LOOP_CROSSING_EDGE
    * @model
    * @generated
    * @ordered
    */
   public static final int LOOP_CROSSING_EDGE_VALUE = 26;

   /**
    * The '<em><b>EXACTLY ONE START NODE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>EXACTLY ONE START NODE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #EXACTLY_ONE_START_NODE
    * @model
    * @generated
    * @ordered
    */
   public static final int EXACTLY_ONE_START_NODE_VALUE = 0;

   /**
    * The '<em><b>AT LEAST ONE STOP NODE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>AT LEAST ONE STOP NODE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #AT_LEAST_ONE_STOP_NODE
    * @model
    * @generated
    * @ordered
    */
   public static final int AT_LEAST_ONE_STOP_NODE_VALUE = 1;

   /**
    * The '<em><b>NO OUTGOING EDGE FROM STOP NODE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>NO OUTGOING EDGE FROM STOP NODE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #NO_OUTGOING_EDGE_FROM_STOP_NODE
    * @model
    * @generated
    * @ordered
    */
   public static final int NO_OUTGOING_EDGE_FROM_STOP_NODE_VALUE = 2;

   /**
    * The '<em><b>ACTIVITY EDGE END NODES IN SAME ACTIVITY</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>ACTIVITY EDGE END NODES IN SAME ACTIVITY</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #ACTIVITY_EDGE_END_NODES_IN_SAME_ACTIVITY
    * @model
    * @generated
    * @ordered
    */
   public static final int ACTIVITY_EDGE_END_NODES_IN_SAME_ACTIVITY_VALUE = 3;

   /**
    * The '<em><b>FOR EACH EDGE FORWARD</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>FOR EACH EDGE FORWARD</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #FOR_EACH_EDGE_FORWARD
    * @model
    * @generated
    * @ordered
    */
   public static final int FOR_EACH_EDGE_FORWARD_VALUE = 4;

   /**
    * The '<em><b>ONE EDGE BACK FROM FOREACH COMPONENT</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>ONE EDGE BACK FROM FOREACH COMPONENT</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #ONE_EDGE_BACK_FROM_FOREACH_COMPONENT
    * @model
    * @generated
    * @ordered
    */
   public static final int ONE_EDGE_BACK_FROM_FOREACH_COMPONENT_VALUE = 5;

   /**
    * The '<em><b>NO EDGE OUT OF FOREACH COMPONENT</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>NO EDGE OUT OF FOREACH COMPONENT</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #NO_EDGE_OUT_OF_FOREACH_COMPONENT
    * @model
    * @generated
    * @ordered
    */
   public static final int NO_EDGE_OUT_OF_FOREACH_COMPONENT_VALUE = 6;

   /**
    * The '<em><b>NO STOP NODE IN FOREACH COMPONENT</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>NO STOP NODE IN FOREACH COMPONENT</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #NO_STOP_NODE_IN_FOREACH_COMPONENT
    * @model
    * @generated
    * @ordered
    */
   public static final int NO_STOP_NODE_IN_FOREACH_COMPONENT_VALUE = 7;

   /**
    * The '<em><b>NODE HAS TO HAVE OUTGOING EDGE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>NODE HAS TO HAVE OUTGOING EDGE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #NODE_HAS_TO_HAVE_OUTGOING_EDGE
    * @model
    * @generated
    * @ordered
    */
   public static final int NODE_HAS_TO_HAVE_OUTGOING_EDGE_VALUE = 8;

   /**
    * The '<em><b>MAX TWO OUTGOING EDGES</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>MAX TWO OUTGOING EDGES</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #MAX_TWO_OUTGOING_EDGES
    * @model
    * @generated
    * @ordered
    */
   public static final int MAX_TWO_OUTGOING_EDGES_VALUE = 9;

   /**
    * The '<em><b>NO INCOMING EDGE INTO START NODE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>NO INCOMING EDGE INTO START NODE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #NO_INCOMING_EDGE_INTO_START_NODE
    * @model
    * @generated
    * @ordered
    */
   public static final int NO_INCOMING_EDGE_INTO_START_NODE_VALUE = 10;

   /**
    * The '<em><b>ONE OUTGOING EDGE FROM START NODE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>ONE OUTGOING EDGE FROM START NODE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #ONE_OUTGOING_EDGE_FROM_START_NODE
    * @model
    * @generated
    * @ordered
    */
   public static final int ONE_OUTGOING_EDGE_FROM_START_NODE_VALUE = 11;

   /**
    * The '<em><b>ONLY ONE EACH TIME EDGE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>ONLY ONE EACH TIME EDGE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #ONLY_ONE_EACH_TIME_EDGE
    * @model
    * @generated
    * @ordered
    */
   public static final int ONLY_ONE_EACH_TIME_EDGE_VALUE = 12;

   /**
    * The '<em><b>FOR EACH FALSE OUTGOING EDGE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>FOR EACH FALSE OUTGOING EDGE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #FOR_EACH_FALSE_OUTGOING_EDGE
    * @model
    * @generated
    * @ordered
    */
   public static final int FOR_EACH_FALSE_OUTGOING_EDGE_VALUE = 13;

   /**
    * The '<em><b>FOR EACH NODE HAS EXACTLY ONE END EDGE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>FOR EACH NODE HAS EXACTLY ONE END EDGE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #FOR_EACH_NODE_HAS_EXACTLY_ONE_END_EDGE
    * @model
    * @generated
    * @ordered
    */
   public static final int FOR_EACH_NODE_HAS_EXACTLY_ONE_END_EDGE_VALUE = 14;

   /**
    * The '<em><b>INVALID OUTGOING EDGES</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>INVALID OUTGOING EDGES</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #INVALID_OUTGOING_EDGES
    * @model
    * @generated
    * @ordered
    */
   public static final int INVALID_OUTGOING_EDGES_VALUE = 15;

   /**
    * The '<em><b>EMBEDDED LOOP FOUND</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>EMBEDDED LOOP FOUND</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #EMBEDDED_LOOP_FOUND
    * @model
    * @generated
    * @ordered
    */
   public static final int EMBEDDED_LOOP_FOUND_VALUE = 16;

   /**
    * The '<em><b>HEAD LOOP EXT BWD EDGE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>HEAD LOOP EXT BWD EDGE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #HEAD_LOOP_EXT_BWD_EDGE
    * @model
    * @generated
    * @ordered
    */
   public static final int HEAD_LOOP_EXT_BWD_EDGE_VALUE = 17;

   /**
    * The '<em><b>SECOND OUT EDGE INVALID</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>SECOND OUT EDGE INVALID</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #SECOND_OUT_EDGE_INVALID
    * @model
    * @generated
    * @ordered
    */
   public static final int SECOND_OUT_EDGE_INVALID_VALUE = 18;

   /**
    * The '<em><b>IFTHEN ONLY ONE JOIN NODE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>IFTHEN ONLY ONE JOIN NODE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #IFTHEN_ONLY_ONE_JOIN_NODE
    * @model
    * @generated
    * @ordered
    */
   public static final int IFTHEN_ONLY_ONE_JOIN_NODE_VALUE = 19;

   /**
    * The '<em><b>BOTH BRANCHES HEAD CONTROLLED</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BOTH BRANCHES HEAD CONTROLLED</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #BOTH_BRANCHES_HEAD_CONTROLLED
    * @model
    * @generated
    * @ordered
    */
   public static final int BOTH_BRANCHES_HEAD_CONTROLLED_VALUE = 20;

   /**
    * The '<em><b>BOTH BRANCHES TAIL CONTROLLED</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BOTH BRANCHES TAIL CONTROLLED</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #BOTH_BRANCHES_TAIL_CONTROLLED
    * @model
    * @generated
    * @ordered
    */
   public static final int BOTH_BRANCHES_TAIL_CONTROLLED_VALUE = 21;

   /**
    * The '<em><b>FOREACH END EDGE ERROR</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>FOREACH END EDGE ERROR</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #FOREACH_END_EDGE_ERROR
    * @model
    * @generated
    * @ordered
    */
   public static final int FOREACH_END_EDGE_ERROR_VALUE = 22;

   /**
    * The '<em><b>EDGE TARGET UNKNOWN TYPE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>EDGE TARGET UNKNOWN TYPE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #EDGE_TARGET_UNKNOWN_TYPE
    * @model
    * @generated
    * @ordered
    */
   public static final int EDGE_TARGET_UNKNOWN_TYPE_VALUE = 23;

   /**
    * The '<em><b>LOOP EXTERN EDGE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>LOOP EXTERN EDGE</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #LOOP_EXTERN_EDGE
    * @model
    * @generated
    * @ordered
    */
   public static final int LOOP_EXTERN_EDGE_VALUE = 24;

   /**
    * The '<em><b>THEN ELSE BRANCH INVALID LOOP CONTAINMENT</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>THEN ELSE BRANCH INVALID LOOP CONTAINMENT</b></em>' literal object isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @see #THEN_ELSE_BRANCH_INVALID_LOOP_CONTAINMENT
    * @model
    * @generated
    * @ordered
    */
   public static final int THEN_ELSE_BRANCH_INVALID_LOOP_CONTAINMENT_VALUE = 25;

   /**
    * An array of all the '<em><b>Errors</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static final Errors[] VALUES_ARRAY = new Errors[] { LOOP_CROSSING_EDGE, EXACTLY_ONE_START_NODE, AT_LEAST_ONE_STOP_NODE,
         NO_OUTGOING_EDGE_FROM_STOP_NODE, ACTIVITY_EDGE_END_NODES_IN_SAME_ACTIVITY, FOR_EACH_EDGE_FORWARD, ONE_EDGE_BACK_FROM_FOREACH_COMPONENT,
         NO_EDGE_OUT_OF_FOREACH_COMPONENT, NO_STOP_NODE_IN_FOREACH_COMPONENT, NODE_HAS_TO_HAVE_OUTGOING_EDGE, MAX_TWO_OUTGOING_EDGES,
         NO_INCOMING_EDGE_INTO_START_NODE, ONE_OUTGOING_EDGE_FROM_START_NODE, ONLY_ONE_EACH_TIME_EDGE, FOR_EACH_FALSE_OUTGOING_EDGE,
         FOR_EACH_NODE_HAS_EXACTLY_ONE_END_EDGE, INVALID_OUTGOING_EDGES, EMBEDDED_LOOP_FOUND, HEAD_LOOP_EXT_BWD_EDGE, SECOND_OUT_EDGE_INVALID,
         IFTHEN_ONLY_ONE_JOIN_NODE, BOTH_BRANCHES_HEAD_CONTROLLED, BOTH_BRANCHES_TAIL_CONTROLLED, FOREACH_END_EDGE_ERROR, EDGE_TARGET_UNKNOWN_TYPE,
         LOOP_EXTERN_EDGE, THEN_ELSE_BRANCH_INVALID_LOOP_CONTAINMENT, };

   /**
    * A public read-only list of all the '<em><b>Errors</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final List<Errors> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>Errors</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param literal the literal.
    * @return the matching enumerator or <code>null</code>.
    * @generated
    */
   public static Errors get(String literal)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         Errors result = VALUES_ARRAY[i];
         if (result.toString().equals(literal))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Errors</b></em>' literal with the specified name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param name the name.
    * @return the matching enumerator or <code>null</code>.
    * @generated
    */
   public static Errors getByName(String name)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         Errors result = VALUES_ARRAY[i];
         if (result.getName().equals(name))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Errors</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the integer value.
    * @return the matching enumerator or <code>null</code>.
    * @generated
    */
   public static Errors get(int value)
   {
      switch (value)
      {
      case LOOP_CROSSING_EDGE_VALUE:
         return LOOP_CROSSING_EDGE;
      case EXACTLY_ONE_START_NODE_VALUE:
         return EXACTLY_ONE_START_NODE;
      case AT_LEAST_ONE_STOP_NODE_VALUE:
         return AT_LEAST_ONE_STOP_NODE;
      case NO_OUTGOING_EDGE_FROM_STOP_NODE_VALUE:
         return NO_OUTGOING_EDGE_FROM_STOP_NODE;
      case ACTIVITY_EDGE_END_NODES_IN_SAME_ACTIVITY_VALUE:
         return ACTIVITY_EDGE_END_NODES_IN_SAME_ACTIVITY;
      case FOR_EACH_EDGE_FORWARD_VALUE:
         return FOR_EACH_EDGE_FORWARD;
      case ONE_EDGE_BACK_FROM_FOREACH_COMPONENT_VALUE:
         return ONE_EDGE_BACK_FROM_FOREACH_COMPONENT;
      case NO_EDGE_OUT_OF_FOREACH_COMPONENT_VALUE:
         return NO_EDGE_OUT_OF_FOREACH_COMPONENT;
      case NO_STOP_NODE_IN_FOREACH_COMPONENT_VALUE:
         return NO_STOP_NODE_IN_FOREACH_COMPONENT;
      case NODE_HAS_TO_HAVE_OUTGOING_EDGE_VALUE:
         return NODE_HAS_TO_HAVE_OUTGOING_EDGE;
      case MAX_TWO_OUTGOING_EDGES_VALUE:
         return MAX_TWO_OUTGOING_EDGES;
      case NO_INCOMING_EDGE_INTO_START_NODE_VALUE:
         return NO_INCOMING_EDGE_INTO_START_NODE;
      case ONE_OUTGOING_EDGE_FROM_START_NODE_VALUE:
         return ONE_OUTGOING_EDGE_FROM_START_NODE;
      case ONLY_ONE_EACH_TIME_EDGE_VALUE:
         return ONLY_ONE_EACH_TIME_EDGE;
      case FOR_EACH_FALSE_OUTGOING_EDGE_VALUE:
         return FOR_EACH_FALSE_OUTGOING_EDGE;
      case FOR_EACH_NODE_HAS_EXACTLY_ONE_END_EDGE_VALUE:
         return FOR_EACH_NODE_HAS_EXACTLY_ONE_END_EDGE;
      case INVALID_OUTGOING_EDGES_VALUE:
         return INVALID_OUTGOING_EDGES;
      case EMBEDDED_LOOP_FOUND_VALUE:
         return EMBEDDED_LOOP_FOUND;
      case HEAD_LOOP_EXT_BWD_EDGE_VALUE:
         return HEAD_LOOP_EXT_BWD_EDGE;
      case SECOND_OUT_EDGE_INVALID_VALUE:
         return SECOND_OUT_EDGE_INVALID;
      case IFTHEN_ONLY_ONE_JOIN_NODE_VALUE:
         return IFTHEN_ONLY_ONE_JOIN_NODE;
      case BOTH_BRANCHES_HEAD_CONTROLLED_VALUE:
         return BOTH_BRANCHES_HEAD_CONTROLLED;
      case BOTH_BRANCHES_TAIL_CONTROLLED_VALUE:
         return BOTH_BRANCHES_TAIL_CONTROLLED;
      case FOREACH_END_EDGE_ERROR_VALUE:
         return FOREACH_END_EDGE_ERROR;
      case EDGE_TARGET_UNKNOWN_TYPE_VALUE:
         return EDGE_TARGET_UNKNOWN_TYPE;
      case LOOP_EXTERN_EDGE_VALUE:
         return LOOP_EXTERN_EDGE;
      case THEN_ELSE_BRANCH_INVALID_LOOP_CONTAINMENT_VALUE:
         return THEN_ELSE_BRANCH_INVALID_LOOP_CONTAINMENT;
      }
      return null;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private final int value;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private final String name;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private final String literal;

   /**
    * Only this class can construct instances.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private Errors(int value, String name, String literal)
   {
      this.value = value;
      this.name = name;
      this.literal = literal;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getValue()
   {
      return value;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getName()
   {
      return name;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getLiteral()
   {
      return literal;
   }

   /**
    * Returns the literal value of the enumerator, which is its string representation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString()
   {
      return literal;
   }

} //Errors
