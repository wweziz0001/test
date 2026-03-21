# تحليل عكسي شامل - تطبيق هدى الله
# Comprehensive Reverse Engineering Analysis - Huda Allah App

## نظرة عامة | Overview

هذا المستودع يحتوي على تحليل عكسي شامل لتطبيق "هدى الله" - تطبيق قرآني شامل مبني بـ Flutter. الهدف هو توثيق البنية والوظائف والبيانات لتسهيل بناء تطبيقات مشابهة بطريقة نظيفة ومشروعة.

This repository contains a comprehensive reverse engineering analysis of "Huda Allah" - a Quran application built with Flutter. The goal is to document the architecture, features, and data to facilitate building similar applications in a clean and legitimate manner.

---

## هيكل المجلدات | Directory Structure

```
analysis_output/
├── BUILD_GUIDE.md           # دليل البناء الشامل للمطورين
├── DATABASE_SCHEMA.md       # مخطط قاعدة البيانات التفصيلي
├── reports/
│   └── Huda_Allah_Reverse_Analysis_Report.docx
├── native_analysis/
│   └── NATIVE_ANALYSIS.md   # تحليل المكتبات الأصلية
├── api_surface/             # (للتوسع) تحليل API
├── architecture/            # (للتوسع) تحليل البنية
├── assets_analysis/         # (للتوسع) تحليل الأصول
├── build_instructions/      # (للتوسع) تعليمات البناء
├── data_models/             # (للتوسع) نماذج البيانات
└── reports/                 # التقارير
```

---

## للذكاء الاصطناعي: كيف تستخدم هذا التحليل؟| For AI: How to Use This Analysis

### الخطوة 1: اقرأ الملفات بالترتيب

1. **BUILD_GUIDE.md** - الدليل الشامل للبناء، يحتوي على:
   - هيكل المجلدات المطلوب
   - الـ dependencies المطلوبة
   - مخطط قاعدة البيانات بـ Drift ORM
   - تكوين الـ API Client
   - أمثلة على BLoC state management
   - تكوين Audio Service
   - تكوين الإشعارات
   - محتوى AndroidManifest.xml

2. **DATABASE_SCHEMA.md** - مخطط قاعدة البيانات:
   - 40 جدول مع الأعمدة والعلاقات
   - الفهارس والقيدات
   - أمثلة على البيانات

3. **NATIVE_ANALYSIS.md** - تحليل المكتبات:
   - تصنيف Strings المستخرجة
   - أسماء الـ BLoCs والـ UseCases
   - أسماء الـ Views والـ Repositories
   - محتوى قاعدة البيانات المضمّن

### الخطوة 2: اتبع خطوات البناء

في **BUILD_GUIDE.md** ستجد "المرحلة 1" إلى "المرحلة 9" التي توضح:

1. إنشاء مشروع Flutter
2. إعداد الـ dependencies
3. إنشاء هيكل المجلدات
4. تعريف جداول قاعدة البيانات
5. تكوين الـ API
6. تنفيذ الـ BLoC
7. تكوين خدمات الصوت
8. تكوين الإشعارات
9. خطوات التنفيذ التدريجية

### الخطوة 3: استخدم المعلومات المستخرجة

- **37+ ميزة** موثقة مع البنية الداخلية
- **40 جدول** معرف بالتفصيل
- **50+ BLoC** موثق
- **100+ UseCase** مستخرج
- **30+ Repository** مستخرج
- **50+ View** مستخرج

---

## المعلومات المؤكدة | Confirmed Information

| المعلومة | القيمة | الثقة |
|----------|--------|-------|
| Framework | Flutter 3.x | 100% |
| State Management | flutter_bloc + freezed | 100% |
| Database | Drift ORM + SQLite | 100% |
| Audio | just_audio + audio_service | 100% |
| DI | GetIt | 100% |
| Base URL | https://hudaallah.tabsera.ye/app_services/ | 100% |
| Package | com.example.hqp_mobile_app | 100% |
| Features Count | 37+ | 95% |
| Tables Count | 40 | 100% |

---

## كيف تبدأ | How to Start

### Option 1: بناء من الصفر
1. اقرأ `BUILD_GUIDE.md` بالكامل
2. أنشئ مشروع Flutter جديد
3. اتبع المراحل بالترتيب

### Option 2: استخدم الـ schema مباشرة
1. استخدم `DATABASE_SCHEMA.md` لتعريف جداول Drift
2. انسخ هيكل المجلدات من `BUILD_GUIDE.md`
3. طبق الـ BLoC patterns الموثقة

---

## ملاحظات مهمة | Important Notes

1. **الهدف تعليمي**: هذا التحليل لغرض التعلم وبناء تطبيقات مشابهة بطريقة مشروعة
2. **لا نسخ للكود**: لا تنسخ الكود المصدري الأصلي - استخدم التحليل كمرجع للبناء
3. **التحقق من المحتوى**: تحقق من صحة المحتوى القرآني والتلاوات
4. **التراخيص**: احصل على تراخيص الخطوط القرآنية

---

## الملفات الأصلية | Original Files

الملفات الأصلية للتحليل موجودة في:
- `reverse_analysis_input/` - الملفات المستخرجة من الـ APK
- `notes/` - ملاحظات قاعدة البيانات
- `Huda_Allah.0.1.13_sm.zip.*` - ملفات Smali المضغوطة
- `main_db@2.zip` - قاعدة البيانات

---

## Contact

For questions about this analysis, refer to:
- The analysis files in `analysis_output/`
- The original files in `reverse_analysis_input/`

---

*تم إنشاء هذا التحليل لغرض تعليمي وبناء تطبيقات مشابهة بطريقة مشروعة.*
*This analysis was created for educational purposes and building similar applications legitimately.*
