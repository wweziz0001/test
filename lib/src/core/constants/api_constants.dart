/// ثوابت مسارات API
class ApiEndpoints {
  // المصادقة
  static const String login = 'auth/login';
  static const String signup = 'auth/signup';
  static const String refreshToken = 'auth/refresh';
  static const String logout = 'auth/logout';
  static const String currentUser = 'user/me';

  // تحديثات قاعدة البيانات
  static const String checkDbVersions = 'db/check-versions';
  static const String downloadDbFiles = 'db/files';

  // القرآن
  static const String surahs = 'quran/surahs';
  static const String ayahs = 'quran/ayahs';
  static const String pages = 'quran/pages';
  static const String juzs = 'quran/juzs';
  static const String hizbs = 'quran/hizbs';
  static const String search = 'quran/search';
  static const String interpretation = 'quran/interpretation';

  // القراء
  static const String reciters = 'reciters';
  static const String recitations = 'recitations';
  static String reciterAudios(int id) => 'reciters/$id/audios';

  // المحاضرات
  static const String lectures = 'lectures';
  static String lectureDetails(int id) => 'lectures/$id';
  static String lectureParagraphs(int id) => 'lectures/$id/paragraphs';
  static String lectureMedia(int id) => 'lectures/$id/media';
  static const String lecturers = 'lecturers';
  static const String albums = 'albums';

  // المحتوى اليومي
  static const String dailyAyah = 'daily-ayah';

  // برامج القراءة
  static const String readingPrograms = 'reading-programs';
  static String subscribeProgram(int id) => 'reading-programs/$id/subscribe';

  // بيانات المستخدم
  static const String favoriteAyahs = 'user/favorite-ayahs';
  static const String favoriteLectures = 'user/favorite-lectures';
  static const String ayahGroups = 'user/ayah-groups';
  static const String khitmahs = 'user/khitmahs';
  static const String stopPoints = 'user/stop-points';

  // الوسائط
  static const String mediaBaseUrl = 'https://hudaallah.tabsera.ye/media/';
  static const String audioBaseUrl = 'https://hudaallah.tabsera.ye/audio/';
  static const String imagesBaseUrl = 'https://hudaallah.tabsera.ye/images/';

  // مساعدات
  static String getAudioUrl(String path) => '$audioBaseUrl$path';
  static String getImageUrl(String path) => '$imagesBaseUrl$path';
  static String getMediaUrl(String path) => '$mediaBaseUrl$path';
}

/// ثوابت إعدادات API
class ApiConfig {
  static const Duration connectTimeout = Duration(seconds: 30);
  static const Duration receiveTimeout = Duration(seconds: 30);
  static const Duration sendTimeout = Duration(seconds: 30);

  static const Map<String, String> defaultHeaders = {
    'Content-Type': 'application/json',
    'Accept': 'application/json',
  };
}
