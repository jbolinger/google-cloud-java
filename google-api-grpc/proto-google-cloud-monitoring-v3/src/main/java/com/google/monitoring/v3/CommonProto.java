// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/common.proto

package com.google.monitoring.v3;

public final class CommonProto {
  private CommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_TypedValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_TypedValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_TimeInterval_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_TimeInterval_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_Aggregation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Aggregation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!google/monitoring/v3/common.proto\022\024goo" +
      "gle.monitoring.v3\032\034google/api/annotation" +
      "s.proto\032\035google/api/distribution.proto\032\036" +
      "google/protobuf/duration.proto\032\037google/p" +
      "rotobuf/timestamp.proto\"\252\001\n\nTypedValue\022\024" +
      "\n\nbool_value\030\001 \001(\010H\000\022\025\n\013int64_value\030\002 \001(" +
      "\003H\000\022\026\n\014double_value\030\003 \001(\001H\000\022\026\n\014string_va" +
      "lue\030\004 \001(\tH\000\0226\n\022distribution_value\030\005 \001(\0132" +
      "\030.google.api.DistributionH\000B\007\n\005value\"l\n\014" +
      "TimeInterval\022,\n\010end_time\030\002 \001(\0132\032.google." +
      "protobuf.Timestamp\022.\n\nstart_time\030\001 \001(\0132\032" +
      ".google.protobuf.Timestamp\"\255\007\n\013Aggregati" +
      "on\0223\n\020alignment_period\030\001 \001(\0132\031.google.pr" +
      "otobuf.Duration\022E\n\022per_series_aligner\030\002 " +
      "\001(\0162).google.monitoring.v3.Aggregation.A" +
      "ligner\022G\n\024cross_series_reducer\030\004 \001(\0162).g" +
      "oogle.monitoring.v3.Aggregation.Reducer\022" +
      "\027\n\017group_by_fields\030\005 \003(\t\"\213\003\n\007Aligner\022\016\n\n" +
      "ALIGN_NONE\020\000\022\017\n\013ALIGN_DELTA\020\001\022\016\n\nALIGN_R" +
      "ATE\020\002\022\025\n\021ALIGN_INTERPOLATE\020\003\022\024\n\020ALIGN_NE" +
      "XT_OLDER\020\004\022\r\n\tALIGN_MIN\020\n\022\r\n\tALIGN_MAX\020\013" +
      "\022\016\n\nALIGN_MEAN\020\014\022\017\n\013ALIGN_COUNT\020\r\022\r\n\tALI" +
      "GN_SUM\020\016\022\020\n\014ALIGN_STDDEV\020\017\022\024\n\020ALIGN_COUN" +
      "T_TRUE\020\020\022\025\n\021ALIGN_COUNT_FALSE\020\030\022\027\n\023ALIGN" +
      "_FRACTION_TRUE\020\021\022\027\n\023ALIGN_PERCENTILE_99\020" +
      "\022\022\027\n\023ALIGN_PERCENTILE_95\020\023\022\027\n\023ALIGN_PERC" +
      "ENTILE_50\020\024\022\027\n\023ALIGN_PERCENTILE_05\020\025\022\030\n\024" +
      "ALIGN_PERCENT_CHANGE\020\027\"\261\002\n\007Reducer\022\017\n\013RE" +
      "DUCE_NONE\020\000\022\017\n\013REDUCE_MEAN\020\001\022\016\n\nREDUCE_M" +
      "IN\020\002\022\016\n\nREDUCE_MAX\020\003\022\016\n\nREDUCE_SUM\020\004\022\021\n\r" +
      "REDUCE_STDDEV\020\005\022\020\n\014REDUCE_COUNT\020\006\022\025\n\021RED" +
      "UCE_COUNT_TRUE\020\007\022\026\n\022REDUCE_COUNT_FALSE\020\017" +
      "\022\030\n\024REDUCE_FRACTION_TRUE\020\010\022\030\n\024REDUCE_PER" +
      "CENTILE_99\020\t\022\030\n\024REDUCE_PERCENTILE_95\020\n\022\030" +
      "\n\024REDUCE_PERCENTILE_50\020\013\022\030\n\024REDUCE_PERCE" +
      "NTILE_05\020\014*\236\001\n\016ComparisonType\022\032\n\026COMPARI" +
      "SON_UNSPECIFIED\020\000\022\021\n\rCOMPARISON_GT\020\001\022\021\n\r" +
      "COMPARISON_GE\020\002\022\021\n\rCOMPARISON_LT\020\003\022\021\n\rCO" +
      "MPARISON_LE\020\004\022\021\n\rCOMPARISON_EQ\020\005\022\021\n\rCOMP" +
      "ARISON_NE\020\006*a\n\013ServiceTier\022\034\n\030SERVICE_TI" +
      "ER_UNSPECIFIED\020\000\022\026\n\022SERVICE_TIER_BASIC\020\001" +
      "\022\030\n\024SERVICE_TIER_PREMIUM\020\002\032\002\030\001B\243\001\n\030com.g" +
      "oogle.monitoring.v3B\013CommonProtoP\001Z>goog" +
      "le.golang.org/genproto/googleapis/monito" +
      "ring/v3;monitoring\252\002\032Google.Cloud.Monito" +
      "ring.V3\312\002\032Google\\Cloud\\Monitoring\\V3b\006pr" +
      "oto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.DistributionProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_google_monitoring_v3_TypedValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_TypedValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_TypedValue_descriptor,
        new java.lang.String[] { "BoolValue", "Int64Value", "DoubleValue", "StringValue", "DistributionValue", "Value", });
    internal_static_google_monitoring_v3_TimeInterval_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_v3_TimeInterval_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_TimeInterval_descriptor,
        new java.lang.String[] { "EndTime", "StartTime", });
    internal_static_google_monitoring_v3_Aggregation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_v3_Aggregation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_Aggregation_descriptor,
        new java.lang.String[] { "AlignmentPeriod", "PerSeriesAligner", "CrossSeriesReducer", "GroupByFields", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.DistributionProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
