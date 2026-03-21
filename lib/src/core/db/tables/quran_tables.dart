import 'package:drift/drift.dart';

/// جدول السور القرآنية
class QuranSurahs extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get juzId => integer().nullable()();
  IntColumn get pageId => integer().nullable()();
  IntColumn get fallOrder => integer().nullable()(); // ترتيب النزول
  IntColumn get moshafOrder => integer().nullable()(); // ترتيب المصحف
  IntColumn get ayahsCount => integer().nullable()();
  IntColumn get fallPlace => integer().nullable()(); // 0=مكية, 1=مدنية
  TextColumn get title => text().withLength(max: 50)();
  TextColumn get names => text().nullable()(); // أسماء السورة
  TextColumn get info => text().nullable()(); // معلومات السورة
  TextColumn get symbol => text().withLength(max: 5)();
  IntColumn get startAyahOrder => integer().nullable()();
}

/// جدول الآيات القرآنية
class QuranAyahs extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get surahId => integer().nullable()();
  IntColumn get juzId => integer().nullable()();
  IntColumn get hizbId => integer().nullable()();
  IntColumn get pageId => integer().nullable()();
  IntColumn get hizbNumber => integer().nullable()();
  IntColumn get ayahOrder => integer().nullable()(); // ترتيب الآية في السورة
  IntColumn get ayahNumber => integer().nullable()(); // رقم الآية
  BoolColumn get isStartHizb => boolean().withDefault(const Constant(false))();
  BoolColumn get isStartJuz => boolean().withDefault(const Constant(false))();
  BoolColumn get hasProstration => boolean().withDefault(const Constant(false))();
  IntColumn get prostrationType => integer().nullable()();
  TextColumn get plainText => text().nullable()(); // النص المجرد
  TextColumn get quranText => text().nullable()(); // النص القرآني بالتشكيل
  TextColumn get stem => text().nullable()(); // الجذر اللغوي
}

/// جدول صفحات المصحف
class QuranPages extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get startSurahId => integer().nullable()();
  IntColumn get startJuzId => integer().nullable()();
  IntColumn get startHizbId => integer().nullable()();
  IntColumn get hizbNumber => integer().nullable()();
  IntColumn get pageNumber => integer().nullable()();
  IntColumn get startAyahNumber => integer().nullable()();
  IntColumn get startAyahOrder => integer().nullable()();
}

/// جدول الأجزاء
class QuranJuzs extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get startSurahId => integer().nullable()();
  IntColumn get startPageId => integer().nullable()();
  IntColumn get juzNumber => integer().nullable()();
  IntColumn get startAyahNumber => integer().nullable()();
  TextColumn get firstAyahs => text().nullable()();
  IntColumn get startAyahOrder => integer().nullable()();
}

/// جدول الأحزاب
class QuranHizbs extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get juzId => integer().nullable()();
  IntColumn get surahId => integer().nullable()();
  IntColumn get startPageId => integer().nullable()();
  IntColumn get hizbNumber => integer().nullable()();
  IntColumn get segmentOrder => integer().nullable()(); // 1-4 (ربع، نصف، ثلاثة أرباع)
  IntColumn get ayahNumber => integer().nullable()();
  TextColumn get firstAyahs => text().nullable()();
  IntColumn get startAyahOrder => integer().nullable()();
  IntColumn get approvalStatus => integer().nullable()();
}

/// جدول الحروف/الرموز (Glyphs)
class QuranGlyphs extends Table {
  IntColumn get id => integer().autoIncrement()();
  IntColumn get code => integer().nullable()(); // رمز Unicode
  IntColumn get ayahId => integer().nullable()();
  IntColumn get ayahNumber => integer().nullable()();
  IntColumn get ayahOrder => integer().nullable()();
  IntColumn get surahId => integer().nullable()();
  IntColumn get pageId => integer().nullable()();
  IntColumn get lineNumber => integer().nullable()();
  IntColumn get glyphTypeId => integer().nullable()();
  IntColumn get hizbId => integer().nullable()();
  IntColumn get juzId => integer().nullable()();
  IntColumn get hizbNumber => integer().nullable()();
  IntColumn get hasProstration => integer().nullable()();
  IntColumn get prostrationType => integer().nullable()();
}

/// جدول أنواع الرموز
class QuranGlyphTypes extends Table {
  IntColumn get id => integer().autoIncrement()();
  TextColumn get name => text().withLength(max: 50)();
  IntColumn get parentId => integer().nullable()();
}

/// جدول القراء
class QuranReciters extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  TextColumn get name => text().nullable()();
  BoolColumn get isComplete => boolean().withDefault(const Constant(false))();
  IntColumn get approvalStatus => integer().nullable()();
  IntColumn get countryId => integer().nullable()();
  TextColumn get profile => text().withLength(max: 100).nullable()();
}

/// جدول التلاوات/الروايات
class QuranRecitations extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  TextColumn get name => text().withLength(max: 50)();
  BoolColumn get isActive => boolean().withDefault(const Constant(false))();
}

/// جدول أنواع القراء (ربط القارئ بالتلاوة)
class QuranReciterTypes extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  IntColumn get reciterId => integer().nullable()();
  IntColumn get recitationId => integer().nullable()();
  IntColumn get approvalStatus => integer().nullable()();
}

/// جدول ملفات الصوت للسور
class QuranReciterAudios extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  IntColumn get reciterId => integer().nullable()();
  IntColumn get surahId => integer().nullable()();
  IntColumn get reciterTypeId => integer().nullable()();
  TextColumn get audio => text().withLength(max: 100)();
  IntColumn get approvalStatus => integer().nullable()();
  BoolColumn get isComplete => boolean().withDefault(const Constant(false))();
}

/// جدول ملفات الصوت للآيات (للتشغيل المتواصل Gapless)
class QuranAyahAudios extends Table {
  IntColumn get id => integer().autoIncrement()();
  DateTimeColumn get deletedAt => dateTime().nullable()();
  DateTimeColumn get createdAt => dateTime().nullable()();
  DateTimeColumn get updatedAt => dateTime().nullable()();
  IntColumn get reciterAudioId => integer().nullable()();
  IntColumn get reciterId => integer().nullable()();
  IntColumn get surahId => integer().nullable()();
  IntColumn get ayahId => integer().nullable()();
  IntColumn get ayahOrder => integer().nullable()();
  IntColumn get reciterTypeId => integer().nullable()();
  TextColumn get audio => text().withLength(max: 100)();
  IntColumn get startTime => integer().nullable()(); // بالمللي ثانية
  IntColumn get endTime => integer().nullable()(); // بالمللي ثانية
}

/// جدول الدول
class CommonCountries extends Table {
  IntColumn get id => integer().autoIncrement()();
  TextColumn get iso => text().withLength(max: 2)();
  TextColumn get name => text().withLength(max: 80)();
  TextColumn get nicename => text().withLength(max: 80)();
  TextColumn get iso3 => text().withLength(max: 3)();
  IntColumn get numcode => integer().nullable()();
  IntColumn get phonecode => integer().nullable()();
}
