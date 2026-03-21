# هدى الله - Huda Allah Clone

<div align="center">
  <img src="assets/images/logos/primary_logo.png" alt="Huda Allah Logo" width="150"/>
  <h3>تطبيق قرآني شامل</h3>
  <p>نسخة مطورة من تطبيق هدى الله</p>
</div>

## نظرة عامة | Overview

تطبيق "هدى الله" هو تطبيق قرآني شامل تم بناؤه باستخدام Flutter. يوفر التطبيق:

- 📖 عرض القرآن الكريم بخط عثماني
- 🎧 استماع للتلاوات القرآنية
- 📚 محاضرات ودروس علمية
- ⭐ نظام المفضلات
- 📅 برامج القراءة والختمات
- 🔍 البحث في القرآن

## الميزات الرئيسية | Main Features

### 1. القرآن الكريم
- عرض صفحات المصحف بالخط العثماني
- التنقل بين السور والأجزاء والأحزاب
- البحث في الآيات القرآنية
- علامات المرجعية ونقاط التوقف

### 2. التلاوات القرآنية
- مكتبة كبيرة من القراء
- تشغيل متواصل (Gapless Playback)
- تحميل التلاوات للاستماع دون اتصال

### 3. المحاضرات
- محاضرات من مشايخ متنوعين
- تصنيف حسب الموضوع والألبوم
- تتبع التقدم في القراءة

### 4. الميزات الشخصية
- نظام الختمات والبرامج القرائية
- الآيات والمحاضرات المفضلة
- تذكيرات يومية

## البنية التقنية | Technical Architecture

### التقنيات المستخدمة
- **Flutter 3.19+** - إطار العمل الأساسي
- **Drift ORM** - قاعدة البيانات المحلية (SQLite)
- **BLoC/Cubit** - إدارة الحالة
- **just_audio** - مشغل الصوت
- **Clean Architecture** - البنية المعمارية

### هيكل المشروع
```
lib/
├── main.dart
└── src/
    ├── core/
    │   ├── api/           # تكوين API
    │   ├── db/            # قاعدة البيانات
    │   ├── constants/     # الثوابت
    │   └── ...
    └── apps/
        └── quran/
            ├── core/
            │   ├── entities/    # الكيانات
            │   ├── repositories/ # واجهات المستودعات
            │   └── ...
            └── features/
                ├── quran_home/
                ├── reciters/
                ├── lectures/
                └── ...
```

### قاعدة البيانات
يتضمن التطبيق 40 جدول قاعدة بيانات تشمل:
- جداول القرآن (السور، الآيات، الصفحات، الأجزاء، الأحزاب)
- جداول القراء والتلاوات
- جداول المحاضرات والمحاضرين
- جداول المستخدم (المفضلات، الختمات، نقاط التوقف)

## البدء | Getting Started

### المتطلبات
- Flutter SDK 3.19+
- Dart SDK 3.3+

### التثبيت
```bash
# استنساخ المشروع
git clone https://github.com/wweziz0001/Huda_allah_analysis.git

# الدخول للمجلد
cd huda_allah_clone

# تثبيت التبعيات
flutter pub get

# تشغيل build_runner لتوليد الكود
flutter pub run build_runner build

# تشغيل التطبيق
flutter run
```

## الخطوط المستخدمة | Fonts
- **UthmanicHafs** - خط المصحف الرئيسي
- **QCF_BSML** - خط البسملة
- **ElMessiri** - خط الواجهة
- **Newmalazim** - خط أرقام الآيات

## المساهمة | Contributing

نرحب بمساهماتكم! يرجى:
1. عمل Fork للمشروع
2. إنشاء فرع للميزة (`git checkout -b feature/AmazingFeature`)
3. عمل Commit للتغييرات (`git commit -m 'Add some AmazingFeature'`)
4. Push للفرع (`git push origin feature/AmazingFeature`)
5. فتح Pull Request

## الترخيص | License

هذا المشروع لأغراض تعليمية وتطويرية.

## الشكر | Acknowledgments

- المطور الأصلي: تبصرة (Tabsera)
- جميع القراء والمحاضرين

---

<div align="center">
  <p>صُنع بـ ❤️ للمجتمع الإسلامي</p>
</div>
