import 'package:drift/drift.dart';

/// جدول الختمات
class Khitmahs extends Table {
  IntColumn get id => integer().autoIncrement()();
  TextColumn get name => text().nullable()();
  IntColumn get divisionUnit => integer().nullable()(); // 0=صفحات, 1=أجزاء, 2=سور
  IntColumn get status => integer().nullable()(); // 0=نشط, 1=متوقف, 2=مكتمل
  DateTimeColumn get startDate => dateTime().nullable()();
  DateTimeColumn get endDate => dateTime().nullable()();
  IntColumn get reminderTime => integer().nullable()(); // بالدقائق من منتصف الليل
  TextColumn get cover => text().withLength(max: 100).nullable()();
}

/// جدول الحصص اليومية للختمة
class KhitmahDailyQuotas extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get khitmahId => integer().nullable()();
  DateTimeColumn get date => dateTime().nullable()();
  IntColumn get fromRecordId => integer().nullable()();
  IntColumn get toRecordId => integer().nullable()();
  BoolColumn get isCompleted => boolean().withDefault(const Constant(false))();
}

/// جدول الآيات المفضلة
class FavoriteAyahs extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get ayahId => integer().nullable()();
  IntColumn get surahId => integer().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
}

/// جدول المحاضرات المفضلة
class FavoriteLectures extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get lectureId => integer().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
}

/// جدول مجموعات الآيات
class AyahGroups extends Table {
  IntColumn get id => integer().autoIncrement()();
  TextColumn get name => text().nullable()();
  TextColumn get description => text().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
}

/// جدول آيات المجموعات
class AyahGroupAyahs extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get ayahGroupId => integer().nullable()();
  IntColumn get ayahId => integer().nullable()();
  IntColumn get ordr => integer().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
}

/// جدول نقاط التوقف
class StopPoints extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get pageId => integer().nullable()();
  IntColumn get ayahId => integer().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
}

/// جدول نقاط توقف المحاضرات
class LectureStopPoints extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get lectureId => integer().nullable()();
  IntColumn get paragraphId => integer().nullable()();
  IntColumn get mediaId => integer().nullable()();
  IntColumn get position => integer().nullable()(); // بالمللي ثانية
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
}

/// جدول برامج القراءة
class ReadingPrograms extends Table {
  IntColumn get id => integer().autoIncrement()();
  TextColumn get name => text().nullable()();
  TextColumn get cover => text().withLength(max: 100).nullable()();
  IntColumn get reminderTime => integer().nullable()();
  DateTimeColumn get startDate => dateTime().nullable()();
  DateTimeColumn get publishDate => dateTime().nullable()();
  IntColumn get approvalStatus => integer().nullable()();
  BoolColumn get isComplete => boolean().withDefault(const Constant(false))();
}

/// جدول أيام برامج القراءة
class ReadingProgramDays extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get programId => integer().nullable()();
  DateTimeColumn get date => dateTime().nullable()();
}

/// جدول مهام برامج القراءة
class ReadingProgramTasks extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get programId => integer().nullable()();
  TextColumn get name => text().nullable()();
  IntColumn get taskTypeId => integer().nullable()();
  IntColumn get ordr => integer().nullable()();
}

/// جدول أنواع مهام القراءة
class ReadingProgramTaskTypes extends Table {
  IntColumn get id => integer().autoIncrement()();
  TextColumn get name => text().nullable()();
  TextColumn get targetTableName => text().nullable()();
  TextColumn get filterField => text().nullable()();
}

/// جدول وحدات مهام القراءة
class ReadingProgramTaskUnits extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get taskId => integer().nullable()();
  IntColumn get dayId => integer().nullable()();
  IntColumn get fromRecordId => integer().nullable()();
  IntColumn get toRecordId => integer().nullable()();
  TextColumn get fromText => text().nullable()();
  TextColumn get toText => text().nullable()();
  TextColumn get fromParentTitle => text().nullable()();
  TextColumn get toParentTitle => text().nullable()();
}

/// جدول الآية اليومية
class DailyAyah extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get ayahId => integer().nullable()();
  DateTimeColumn get date => dateTime().nullable()();
  BoolColumn get isRead => boolean().withDefault(const Constant(false))();
}

/// جدول الإشارات المرجعية
class Bookmarks extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get pageId => integer().nullable()();
  IntColumn get ayahId => integer().nullable()();
  IntColumn get surahId => integer().nullable()();
  TextColumn get name => text().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
}

/// جدول سجل القراءة
class ReadingHistory extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get pageId => integer().nullable()();
  IntColumn get ayahId => integer().nullable()();
  IntColumn get surahId => integer().nullable()();
  DateTimeColumn get readAt => dateTime().nullable()();
  IntColumn get duration => integer().nullable()(); // بالثواني
}

/// جدول التنزيلات
class Downloads extends Table {
  IntColumn get id => integer().autoIncrement()();
  TextColumn get url => text().nullable()();
  TextColumn get localPath => text().nullable()();
  TextColumn get fileName => text().nullable()();
  IntColumn get fileType => integer().nullable()(); // 0=صوت قرآن, 1=محاضرة, 2=وسائط
  IntColumn get referenceId => integer().nullable()();
  IntColumn get progress => integer().nullable()();
  IntColumn get status => integer().nullable()(); // 0=قيد التنزيل, 1=مكتمل, 2=فشل
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get completedAt => dateTime().nullable()();
}
