/// ثوابت التطبيق
class AppConstants {
  // معلومات التطبيق
  static const String appName = 'هدى الله';
  static const String appVersion = '1.0.0';
  static const String buildNumber = '1';

  // معلومات المطور
  static const String developerName = 'تبصرة';
  static const String developerEmail = 'info@tabsera.com.ye';
  static const String developerWebsite = 'https://tabsera.com.ye';

  // API
  static const String baseUrl = 'https://hudaallah.tabsera.ye/app_services/';
  static const String apiVersion = 'v1';

  // قاعدة البيانات
  static const String databaseName = 'huda_allah.db';
  static const int databaseVersion = 2;

  // إعدادات القرآن
  static const int quranPagesCount = 604;
  static const int quranSurahsCount = 114;
  static const int quranJuzsCount = 30;
  static const int quranHizbsCount = 60;

  // أوقات التذكير الافتراضية
  static const int defaultDailyAyahHour = 8;
  static const int defaultDailyAyahMinute = 0;

  // أسماء الجداول في قاعدة البيانات
  static const String tableSurahs = 'quran_surah';
  static const String tableAyahs = 'quran_ayah';
  static const String tablePages = 'quran_page';
  static const String tableJuzs = 'quran_juz';
  static const String tableHizbs = 'quran_hizb';
  static const String tableReciters = 'quran_reciter';
  static const String tableLectures = 'quran_wiki_lecture';
  static const String tableLecturers = 'quran_wiki_lecturer';
}
