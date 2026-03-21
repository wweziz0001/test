.class public final enum Lj$/time/temporal/a;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lj$/time/temporal/r;


# static fields
.field public static final enum ALIGNED_DAY_OF_WEEK_IN_MONTH:Lj$/time/temporal/a;

.field public static final enum ALIGNED_DAY_OF_WEEK_IN_YEAR:Lj$/time/temporal/a;

.field public static final enum ALIGNED_WEEK_OF_MONTH:Lj$/time/temporal/a;

.field public static final enum ALIGNED_WEEK_OF_YEAR:Lj$/time/temporal/a;

.field public static final enum AMPM_OF_DAY:Lj$/time/temporal/a;

.field public static final enum CLOCK_HOUR_OF_AMPM:Lj$/time/temporal/a;

.field public static final enum CLOCK_HOUR_OF_DAY:Lj$/time/temporal/a;

.field public static final enum DAY_OF_MONTH:Lj$/time/temporal/a;

.field public static final enum DAY_OF_WEEK:Lj$/time/temporal/a;

.field public static final enum DAY_OF_YEAR:Lj$/time/temporal/a;

.field public static final enum EPOCH_DAY:Lj$/time/temporal/a;

.field public static final enum ERA:Lj$/time/temporal/a;

.field public static final enum HOUR_OF_AMPM:Lj$/time/temporal/a;

.field public static final enum HOUR_OF_DAY:Lj$/time/temporal/a;

.field public static final enum INSTANT_SECONDS:Lj$/time/temporal/a;

.field public static final enum MICRO_OF_DAY:Lj$/time/temporal/a;

.field public static final enum MICRO_OF_SECOND:Lj$/time/temporal/a;

.field public static final enum MILLI_OF_DAY:Lj$/time/temporal/a;

.field public static final enum MILLI_OF_SECOND:Lj$/time/temporal/a;

.field public static final enum MINUTE_OF_DAY:Lj$/time/temporal/a;

.field public static final enum MINUTE_OF_HOUR:Lj$/time/temporal/a;

.field public static final enum MONTH_OF_YEAR:Lj$/time/temporal/a;

.field public static final enum NANO_OF_DAY:Lj$/time/temporal/a;

.field public static final enum NANO_OF_SECOND:Lj$/time/temporal/a;

.field public static final enum OFFSET_SECONDS:Lj$/time/temporal/a;

.field public static final enum PROLEPTIC_MONTH:Lj$/time/temporal/a;

.field public static final enum SECOND_OF_DAY:Lj$/time/temporal/a;

.field public static final enum SECOND_OF_MINUTE:Lj$/time/temporal/a;

.field public static final enum YEAR:Lj$/time/temporal/a;

.field public static final enum YEAR_OF_ERA:Lj$/time/temporal/a;

.field private static final synthetic c:[Lj$/time/temporal/a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lj$/time/temporal/w;


# direct methods
.method static constructor <clinit>()V
    .locals 53

    .line 120
    new-instance v0, Lj$/time/temporal/a;

    sget-object v1, Lj$/time/temporal/b;->NANOS:Lj$/time/temporal/b;

    const-wide/16 v1, 0x0

    const-wide/32 v3, 0x3b9ac9ff

    invoke-static {v1, v2, v3, v4}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v5

    const/4 v6, 0x0

    const-string v7, "NanoOfSecond"

    const-string v8, "NANO_OF_SECOND"

    invoke-direct {v0, v8, v6, v7, v5}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;)V

    sput-object v0, Lj$/time/temporal/a;->NANO_OF_SECOND:Lj$/time/temporal/a;

    .line 136
    new-instance v5, Lj$/time/temporal/a;

    const-wide v6, 0x4e94914effffL

    invoke-static {v1, v2, v6, v7}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v6

    const/4 v7, 0x1

    const-string v8, "NanoOfDay"

    const-string v9, "NANO_OF_DAY"

    invoke-direct {v5, v9, v7, v8, v6}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;)V

    sput-object v5, Lj$/time/temporal/a;->NANO_OF_DAY:Lj$/time/temporal/a;

    .line 156
    new-instance v6, Lj$/time/temporal/a;

    const-wide/32 v7, 0xf423f

    invoke-static {v1, v2, v7, v8}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v7

    const/4 v8, 0x2

    const-string v9, "MicroOfSecond"

    const-string v10, "MICRO_OF_SECOND"

    invoke-direct {v6, v10, v8, v9, v7}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;)V

    sput-object v6, Lj$/time/temporal/a;->MICRO_OF_SECOND:Lj$/time/temporal/a;

    .line 175
    new-instance v7, Lj$/time/temporal/a;

    const-wide v8, 0x141dd75fffL

    invoke-static {v1, v2, v8, v9}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v8

    const/4 v9, 0x3

    const-string v10, "MicroOfDay"

    const-string v11, "MICRO_OF_DAY"

    invoke-direct {v7, v11, v9, v10, v8}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;)V

    sput-object v7, Lj$/time/temporal/a;->MICRO_OF_DAY:Lj$/time/temporal/a;

    .line 195
    new-instance v8, Lj$/time/temporal/a;

    const-wide/16 v9, 0x3e7

    invoke-static {v1, v2, v9, v10}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v9

    const/4 v10, 0x4

    const-string v11, "MilliOfSecond"

    const-string v12, "MILLI_OF_SECOND"

    invoke-direct {v8, v12, v10, v11, v9}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;)V

    sput-object v8, Lj$/time/temporal/a;->MILLI_OF_SECOND:Lj$/time/temporal/a;

    .line 214
    new-instance v9, Lj$/time/temporal/a;

    const-wide/32 v10, 0x5265bff

    invoke-static {v1, v2, v10, v11}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v10

    const/4 v11, 0x5

    const-string v12, "MilliOfDay"

    const-string v13, "MILLI_OF_DAY"

    invoke-direct {v9, v13, v11, v12, v10}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;)V

    sput-object v9, Lj$/time/temporal/a;->MILLI_OF_DAY:Lj$/time/temporal/a;

    .line 224
    new-instance v10, Lj$/time/temporal/a;

    const-wide/16 v11, 0x3b

    invoke-static {v1, v2, v11, v12}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v18

    const-string v17, "SecondOfMinute"

    const/16 v19, 0x0

    const-string v15, "SECOND_OF_MINUTE"

    const/16 v16, 0x6

    move-object v14, v10

    invoke-direct/range {v14 .. v19}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;I)V

    sput-object v10, Lj$/time/temporal/a;->SECOND_OF_MINUTE:Lj$/time/temporal/a;

    .line 236
    new-instance v13, Lj$/time/temporal/a;

    const-wide/32 v14, 0x1517f

    invoke-static {v1, v2, v14, v15}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v14

    const/4 v15, 0x7

    const-string v3, "SecondOfDay"

    const-string v4, "SECOND_OF_DAY"

    invoke-direct {v13, v4, v15, v3, v14}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;)V

    sput-object v13, Lj$/time/temporal/a;->SECOND_OF_DAY:Lj$/time/temporal/a;

    .line 246
    new-instance v14, Lj$/time/temporal/a;

    invoke-static {v1, v2, v11, v12}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v22

    const-string v21, "MinuteOfHour"

    const/16 v23, 0x0

    const-string v19, "MINUTE_OF_HOUR"

    const/16 v20, 0x8

    move-object/from16 v18, v14

    invoke-direct/range {v18 .. v23}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;I)V

    sput-object v14, Lj$/time/temporal/a;->MINUTE_OF_HOUR:Lj$/time/temporal/a;

    .line 257
    new-instance v11, Lj$/time/temporal/a;

    const-wide/16 v3, 0x59f

    invoke-static {v1, v2, v3, v4}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v3

    const/16 v4, 0x9

    const-string v12, "MinuteOfDay"

    const-string v15, "MINUTE_OF_DAY"

    invoke-direct {v11, v15, v4, v12, v3}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;)V

    sput-object v11, Lj$/time/temporal/a;->MINUTE_OF_DAY:Lj$/time/temporal/a;

    .line 273
    new-instance v12, Lj$/time/temporal/a;

    const-wide/16 v3, 0xb

    invoke-static {v1, v2, v3, v4}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v3

    const/16 v4, 0xa

    const-string v15, "HourOfAmPm"

    const-string v1, "HOUR_OF_AMPM"

    invoke-direct {v12, v1, v4, v15, v3}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;)V

    sput-object v12, Lj$/time/temporal/a;->HOUR_OF_AMPM:Lj$/time/temporal/a;

    .line 289
    new-instance v15, Lj$/time/temporal/a;

    const-wide/16 v1, 0x1

    const-wide/16 v3, 0xc

    move-object/from16 v20, v12

    invoke-static {v1, v2, v3, v4}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v12

    const/16 v3, 0xb

    const-string v4, "ClockHourOfAmPm"

    const-string v1, "CLOCK_HOUR_OF_AMPM"

    invoke-direct {v15, v1, v3, v4, v12}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;)V

    sput-object v15, Lj$/time/temporal/a;->CLOCK_HOUR_OF_AMPM:Lj$/time/temporal/a;

    .line 306
    new-instance v12, Lj$/time/temporal/a;

    const-wide/16 v1, 0x17

    const-wide/16 v3, 0x0

    invoke-static {v3, v4, v1, v2}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v29

    const-string v28, "HourOfDay"

    const/16 v30, 0x0

    const-string v26, "HOUR_OF_DAY"

    const/16 v27, 0xc

    move-object/from16 v25, v12

    invoke-direct/range {v25 .. v30}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;I)V

    sput-object v12, Lj$/time/temporal/a;->HOUR_OF_DAY:Lj$/time/temporal/a;

    .line 322
    new-instance v4, Lj$/time/temporal/a;

    const-wide/16 v1, 0x18

    move-object/from16 v25, v11

    move-object/from16 v30, v12

    const-wide/16 v11, 0x1

    invoke-static {v11, v12, v1, v2}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v1

    const/16 v2, 0xd

    const-string v3, "ClockHourOfDay"

    const-string v11, "CLOCK_HOUR_OF_DAY"

    invoke-direct {v4, v11, v2, v3, v1}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;)V

    sput-object v4, Lj$/time/temporal/a;->CLOCK_HOUR_OF_DAY:Lj$/time/temporal/a;

    .line 335
    new-instance v37, Lj$/time/temporal/a;

    const-wide/16 v1, 0x0

    const-wide/16 v11, 0x1

    invoke-static {v1, v2, v11, v12}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v35

    const-string v34, "AmPmOfDay"

    const/16 v36, 0x0

    const-string v32, "AMPM_OF_DAY"

    const/16 v33, 0xe

    move-object/from16 v31, v37

    invoke-direct/range {v31 .. v36}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;I)V

    sput-object v37, Lj$/time/temporal/a;->AMPM_OF_DAY:Lj$/time/temporal/a;

    .line 351
    new-instance v31, Lj$/time/temporal/a;

    const-wide/16 v1, 0x7

    const-wide/16 v11, 0x1

    invoke-static {v11, v12, v1, v2}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v42

    const-string v41, "DayOfWeek"

    const/16 v43, 0x0

    const-string v39, "DAY_OF_WEEK"

    const/16 v40, 0xf

    move-object/from16 v38, v31

    invoke-direct/range {v38 .. v43}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;I)V

    sput-object v31, Lj$/time/temporal/a;->DAY_OF_WEEK:Lj$/time/temporal/a;

    .line 369
    new-instance v12, Lj$/time/temporal/a;

    move-object/from16 v32, v4

    const-wide/16 v3, 0x1

    invoke-static {v3, v4, v1, v2}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v11

    const/16 v1, 0x10

    const-string v2, "AlignedDayOfWeekInMonth"

    const-string v3, "ALIGNED_DAY_OF_WEEK_IN_MONTH"

    invoke-direct {v12, v3, v1, v2, v11}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;)V

    sput-object v12, Lj$/time/temporal/a;->ALIGNED_DAY_OF_WEEK_IN_MONTH:Lj$/time/temporal/a;

    .line 387
    new-instance v11, Lj$/time/temporal/a;

    const-wide/16 v1, 0x1

    const-wide/16 v3, 0x7

    invoke-static {v1, v2, v3, v4}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v3

    const/16 v1, 0x11

    const-string v2, "AlignedDayOfWeekInYear"

    const-string v4, "ALIGNED_DAY_OF_WEEK_IN_YEAR"

    invoke-direct {v11, v4, v1, v2, v3}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;)V

    sput-object v11, Lj$/time/temporal/a;->ALIGNED_DAY_OF_WEEK_IN_YEAR:Lj$/time/temporal/a;

    .line 400
    new-instance v33, Lj$/time/temporal/a;

    const-wide/16 v1, 0x1c

    const-wide/16 v3, 0x1f

    .line 147
    invoke-static {v1, v2, v3, v4}, Lj$/time/temporal/w;->k(JJ)Lj$/time/temporal/w;

    move-result-object v42

    .line 400
    const-string v41, "DayOfMonth"

    const/16 v43, 0x0

    const-string v39, "DAY_OF_MONTH"

    const/16 v40, 0x12

    move-object/from16 v38, v33

    invoke-direct/range {v38 .. v43}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;I)V

    sput-object v33, Lj$/time/temporal/a;->DAY_OF_MONTH:Lj$/time/temporal/a;

    .line 418
    new-instance v4, Lj$/time/temporal/a;

    const-wide/16 v1, 0x16d

    move-object/from16 v35, v11

    move-object/from16 v34, v12

    const-wide/16 v11, 0x16e

    .line 147
    invoke-static {v1, v2, v11, v12}, Lj$/time/temporal/w;->k(JJ)Lj$/time/temporal/w;

    move-result-object v1

    const/16 v2, 0x13

    .line 418
    const-string v3, "DayOfYear"

    const-string v11, "DAY_OF_YEAR"

    invoke-direct {v4, v11, v2, v3, v1}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;)V

    sput-object v4, Lj$/time/temporal/a;->DAY_OF_YEAR:Lj$/time/temporal/a;

    .line 431
    new-instance v12, Lj$/time/temporal/a;

    const-wide v1, -0x550a313cdaL

    move-object v11, v4

    const-wide v3, 0x550a1b48f7L

    invoke-static {v1, v2, v3, v4}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v1

    const/16 v2, 0x14

    const-string v3, "EpochDay"

    const-string v4, "EPOCH_DAY"

    invoke-direct {v12, v4, v2, v3, v1}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;)V

    sput-object v12, Lj$/time/temporal/a;->EPOCH_DAY:Lj$/time/temporal/a;

    .line 447
    new-instance v4, Lj$/time/temporal/a;

    const-wide/16 v1, 0x4

    move-object/from16 v38, v11

    move-object/from16 v36, v12

    const-wide/16 v11, 0x5

    .line 147
    invoke-static {v1, v2, v11, v12}, Lj$/time/temporal/w;->k(JJ)Lj$/time/temporal/w;

    move-result-object v1

    const/16 v2, 0x15

    .line 447
    const-string v3, "AlignedWeekOfMonth"

    const-string v11, "ALIGNED_WEEK_OF_MONTH"

    invoke-direct {v4, v11, v2, v3, v1}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;)V

    sput-object v4, Lj$/time/temporal/a;->ALIGNED_WEEK_OF_MONTH:Lj$/time/temporal/a;

    .line 463
    new-instance v12, Lj$/time/temporal/a;

    const-wide/16 v1, 0x35

    move-object v11, v4

    const-wide/16 v3, 0x1

    invoke-static {v3, v4, v1, v2}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v1

    const/16 v2, 0x16

    const-string v3, "AlignedWeekOfYear"

    const-string v4, "ALIGNED_WEEK_OF_YEAR"

    invoke-direct {v12, v4, v2, v3, v1}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;)V

    sput-object v12, Lj$/time/temporal/a;->ALIGNED_WEEK_OF_YEAR:Lj$/time/temporal/a;

    .line 474
    new-instance v45, Lj$/time/temporal/a;

    const-wide/16 v1, 0x1

    const-wide/16 v3, 0xc

    invoke-static {v1, v2, v3, v4}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v43

    const-string v42, "MonthOfYear"

    const/16 v44, 0x0

    const-string v40, "MONTH_OF_YEAR"

    const/16 v41, 0x17

    move-object/from16 v39, v45

    invoke-direct/range {v39 .. v44}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;I)V

    sput-object v45, Lj$/time/temporal/a;->MONTH_OF_YEAR:Lj$/time/temporal/a;

    .line 494
    new-instance v4, Lj$/time/temporal/a;

    const-wide v1, -0x2cb4177f4L

    move-object/from16 v22, v11

    move-object/from16 v21, v12

    const-wide v11, 0x2cb4177ffL

    invoke-static {v1, v2, v11, v12}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v1

    const/16 v2, 0x18

    const-string v3, "ProlepticMonth"

    const-string v11, "PROLEPTIC_MONTH"

    invoke-direct {v4, v11, v2, v3, v1}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;)V

    sput-object v4, Lj$/time/temporal/a;->PROLEPTIC_MONTH:Lj$/time/temporal/a;

    .line 529
    new-instance v12, Lj$/time/temporal/a;

    const-wide/32 v1, 0x3b9aca00

    move-object v11, v4

    const-wide/32 v3, 0x3b9ac9ff

    .line 147
    invoke-static {v3, v4, v1, v2}, Lj$/time/temporal/w;->k(JJ)Lj$/time/temporal/w;

    move-result-object v1

    const/16 v2, 0x19

    .line 529
    const-string v3, "YearOfEra"

    const-string v4, "YEAR_OF_ERA"

    invoke-direct {v12, v4, v2, v3, v1}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;)V

    sput-object v12, Lj$/time/temporal/a;->YEAR_OF_ERA:Lj$/time/temporal/a;

    .line 553
    new-instance v1, Lj$/time/temporal/a;

    move-object/from16 v26, v1

    const-wide/32 v2, -0x3b9ac9ff

    move-object v4, v11

    move-object/from16 v46, v12

    const-wide/32 v11, 0x3b9ac9ff

    invoke-static {v2, v3, v11, v12}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v43

    const-string v42, "Year"

    const/16 v44, 0x0

    const-string v40, "YEAR"

    const/16 v41, 0x1a

    move-object/from16 v39, v1

    invoke-direct/range {v39 .. v44}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;I)V

    sput-object v1, Lj$/time/temporal/a;->YEAR:Lj$/time/temporal/a;

    .line 570
    new-instance v1, Lj$/time/temporal/a;

    move-object/from16 v27, v1

    const-wide/16 v2, 0x0

    const-wide/16 v11, 0x1

    invoke-static {v2, v3, v11, v12}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v51

    const-string v50, "Era"

    const/16 v52, 0x0

    const-string v48, "ERA"

    const/16 v49, 0x1b

    move-object/from16 v47, v1

    invoke-direct/range {v47 .. v52}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;I)V

    sput-object v1, Lj$/time/temporal/a;->ERA:Lj$/time/temporal/a;

    .line 585
    new-instance v1, Lj$/time/temporal/a;

    move-object/from16 v28, v1

    const-wide/high16 v2, -0x8000000000000000L

    const-wide v11, 0x7fffffffffffffffL

    invoke-static {v2, v3, v11, v12}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v2

    const/16 v3, 0x1c

    const-string v11, "InstantSeconds"

    const-string v12, "INSTANT_SECONDS"

    invoke-direct {v1, v12, v3, v11, v2}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;)V

    sput-object v1, Lj$/time/temporal/a;->INSTANT_SECONDS:Lj$/time/temporal/a;

    .line 599
    new-instance v1, Lj$/time/temporal/a;

    move-object/from16 v29, v1

    const-wide/32 v2, -0xfd20

    const-wide/32 v11, 0xfd20

    invoke-static {v2, v3, v11, v12}, Lj$/time/temporal/w;->j(JJ)Lj$/time/temporal/w;

    move-result-object v2

    const/16 v3, 0x1d

    const-string v11, "OffsetSeconds"

    const-string v12, "OFFSET_SECONDS"

    invoke-direct {v1, v12, v3, v11, v2}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;)V

    sput-object v1, Lj$/time/temporal/a;->OFFSET_SECONDS:Lj$/time/temporal/a;

    move-object v1, v5

    move-object v2, v6

    move-object v3, v7

    move-object/from16 v24, v4

    move-object/from16 v16, v32

    move-object/from16 v19, v38

    move-object v4, v8

    move-object v5, v9

    move-object v6, v10

    move-object v7, v13

    move-object v8, v14

    move-object/from16 v9, v25

    move-object/from16 v10, v20

    move-object/from16 v17, v35

    move-object v11, v15

    move-object/from16 v23, v21

    move-object/from16 v18, v34

    move-object/from16 v20, v36

    move-object/from16 v25, v46

    move-object/from16 v12, v30

    move-object/from16 v13, v16

    move-object/from16 v14, v37

    move-object/from16 v15, v31

    move-object/from16 v16, v18

    move-object/from16 v18, v33

    move-object/from16 v21, v22

    move-object/from16 v22, v23

    move-object/from16 v23, v45

    .line 98
    filled-new-array/range {v0 .. v29}, [Lj$/time/temporal/a;

    move-result-object v0

    sput-object v0, Lj$/time/temporal/a;->c:[Lj$/time/temporal/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;)V
    .locals 0

    .line 607
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 608
    iput-object p3, p0, Lj$/time/temporal/a;->a:Ljava/lang/String;

    .line 611
    iput-object p4, p0, Lj$/time/temporal/a;->b:Lj$/time/temporal/w;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/w;I)V
    .locals 0

    .line 616
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 617
    iput-object p3, p0, Lj$/time/temporal/a;->a:Ljava/lang/String;

    .line 620
    iput-object p4, p0, Lj$/time/temporal/a;->b:Lj$/time/temporal/w;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lj$/time/temporal/a;
    .locals 1

    .line 98
    const-class v0, Lj$/time/temporal/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj$/time/temporal/a;

    return-object p0
.end method

.method public static values()[Lj$/time/temporal/a;
    .locals 1

    .line 98
    sget-object v0, Lj$/time/temporal/a;->c:[Lj$/time/temporal/a;

    invoke-virtual {v0}, [Lj$/time/temporal/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj$/time/temporal/a;

    return-object v0
.end method


# virtual methods
.method public final B()Lj$/time/temporal/w;
    .locals 1

    .line 669
    iget-object v0, p0, Lj$/time/temporal/a;->b:Lj$/time/temporal/w;

    return-object v0
.end method

.method public final I(Lj$/time/temporal/TemporalAccessor;)Lj$/time/temporal/w;
    .locals 0

    .line 743
    invoke-interface {p1, p0}, Lj$/time/temporal/TemporalAccessor;->l(Lj$/time/temporal/r;)Lj$/time/temporal/w;

    move-result-object p1

    return-object p1
.end method

.method public final S()Z
    .locals 2

    .line 682
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sget-object v1, Lj$/time/temporal/a;->DAY_OF_WEEK:Lj$/time/temporal/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sget-object v1, Lj$/time/temporal/a;->ERA:Lj$/time/temporal/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final V(Lj$/time/temporal/TemporalAccessor;)Z
    .locals 0

    .line 738
    invoke-interface {p1, p0}, Lj$/time/temporal/TemporalAccessor;->f(Lj$/time/temporal/r;)Z

    move-result p1

    return p1
.end method

.method public final Y(J)I
    .locals 1

    .line 732
    iget-object v0, p0, Lj$/time/temporal/a;->b:Lj$/time/temporal/w;

    invoke-virtual {v0, p1, p2, p0}, Lj$/time/temporal/w;->a(JLj$/time/temporal/r;)I

    move-result p1

    return p1
.end method

.method public final Z(J)V
    .locals 1

    .line 713
    iget-object v0, p0, Lj$/time/temporal/a;->b:Lj$/time/temporal/w;

    invoke-virtual {v0, p1, p2, p0}, Lj$/time/temporal/w;->b(JLj$/time/temporal/r;)V

    return-void
.end method

.method public final a0()Z
    .locals 2

    .line 694
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sget-object v1, Lj$/time/temporal/a;->DAY_OF_WEEK:Lj$/time/temporal/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final p(Lj$/time/temporal/m;J)Lj$/time/temporal/m;
    .locals 0

    .line 754
    invoke-interface {p1, p2, p3, p0}, Lj$/time/temporal/m;->b(JLj$/time/temporal/r;)Lj$/time/temporal/m;

    move-result-object p1

    return-object p1
.end method

.method public final r(Lj$/time/temporal/TemporalAccessor;)J
    .locals 2

    .line 748
    invoke-interface {p1, p0}, Lj$/time/temporal/TemporalAccessor;->g(Lj$/time/temporal/r;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 760
    iget-object v0, p0, Lj$/time/temporal/a;->a:Ljava/lang/String;

    return-object v0
.end method
