# Huda Allah Application - Reverse Engineering Analysis Repository

## نظرة عامة | Overview

هذا المستودع يحتوي على تحليل عكسي شامل لتطبيق "هدى الله" (Huda Allah) - تطبيق قرآني شامل. الهدف هو توفير وثائق تقنية كاملة تمكّن أي نموذج ذكاء اصطناعي أو مطور من بناء تطبيق مشابه بطريقة نظيفة ومشروعة.

This repository contains comprehensive reverse engineering analysis of "Huda Allah" - a complete Quran application. The goal is to provide full technical documentation enabling any AI model or developer to build a similar application in a clean and legitimate manner.

---

## للذكاء الاصطناعي: ابدأ من هنا | For AI: Start Here

**⚠️ مهم: اقرأ الملفات التالية بالترتيب ⚠️**

### Step 1: Read the Main Guide

📁 **`analysis_output/BUILD_GUIDE.md`** - **اقرأ هذا أولاً!**

يحتوي على:
- هيكل المشروع الكامل
- جميع الـ dependencies المطلوبة
- مخطط قاعدة البيانات بـ Drift ORM
- تكوين الـ API Client
- أمثلة BLoC/Cubit
- تكوين Audio Service
- تكوين الإشعارات
- AndroidManifest.xml
- خطوات التنفيذ التدريجية

### Step 2: Read Database Schema

📁 **`analysis_output/DATABASE_SCHEMA.md`**

يحتوي على:
- 40 جدول معرف بالتفصيل
- العلاقات والفهارس
- أمثلة على البيانات
- Entity Relationship Diagram

### Step 3: Read Native Analysis

📁 **`analysis_output/native_analysis/NATIVE_ANALYSIS.md`**

يحتوي على:
- تصنيف Strings المستخرجة
- 50+ BLoC names
- 100+ UseCase names
- 30+ Repository names
- 50+ View names

---

## المعلومات المستخرجة | Extracted Information

| Category | Count | Confidence |
|----------|-------|------------|
| Feature Modules | 37+ | 100% |
| Database Tables | 40 | 100% |
| BLoC Components | 50+ | 100% |
| UseCases | 100+ | 95% |
| Repositories | 30+ | 95% |
| Views/Screens | 50+ | 90% |
| API Endpoints | 10+ | 80% |

---

## التقنيات المكتشفة | Detected Technologies

| Layer | Technology |
|-------|------------|
| Framework | Flutter 3.x |
| State Management | flutter_bloc + freezed |
| Database | Drift ORM + SQLite |
| DI Container | GetIt |
| HTTP Client | Dio |
| Audio | just_audio + audio_service |
| Notifications | flutter_local_notifications |
| Downloads | flutter_downloader |
| Background Tasks | workmanager |

---

## هيكل المستودع | Repository Structure

```
Huda_allah_analysis/
├── README.md                        # هذا الملف
├── analysis_output/                 # 📁 التحليلات الرئيسية
│   ├── README.md                   # دليل التحليلات
│   ├── BUILD_GUIDE.md              # 📋 دليل البناء الشامل
│   ├── DATABASE_SCHEMA.md          # 📋 مخطط قاعدة البيانات
│   ├── native_analysis/
│   │   └── NATIVE_ANALYSIS.md      # تحليل المكتبات الأصلية
│   └── reports/
│       └── Huda_Allah_Reverse_Analysis_Report.docx
│
├── reverse_analysis_input/          # 📁 الملفات الأصلية
│   ├── apk_decoded/                # APK مفكك
│   ├── apk_raw/                    # APK خام
│   ├── jadx_out/                   # JADX output
│   └── notes/                      # ملاحظات قاعدة البيانات
│       ├── db_schema.txt
│       ├── db_tables.txt
│       └── db_dump_part_*
│
├── Huda_Allah.0.1.13_sm.zip.*      # Smali files (4 parts)
└── main_db@2.zip                   # Database
```

---

## كيف تبني تطبيق مشابه | How to Build Similar App

### للمطورين البشريين:

1. اقرأ `analysis_output/BUILD_GUIDE.md`
2. ادرس `analysis_output/DATABASE_SCHEMA.md`
3. اتبع خطوات التنفيذ في المرحلة 9 من BUILD_GUIDE

### للذكاء الاصطناعي:

**Prompt مقترح:**

```
أريدك أن تبني تطبيق Flutter مشابه لتطبيق "هدى الله" - تطبيق قرآني شامل.

قبل البدء:
1. اقرأ ملف analysis_output/BUILD_GUIDE.md بالكامل
2. اقرأ ملف analysis_output/DATABASE_SCHEMA.md
3. اقرأ ملف analysis_output/native_analysis/NATIATIVE_ANALYSIS.md

المطلوب:
- اتبع هيكل المجلدات المذكور في BUILD_GUIDE
- استخدم الـ dependencies المذكورة
- عرّف جداول قاعدة البيانات حسب DATABASE_SCHEMA
- طبق الـ BLoC pattern مع الـ components المذكورة
- لا تنسخ الكود الأصلي - استخدم التحليل كمرجع للبناء من الصفر

الميزات المطلوبة (حسب التحليل):
1. عرض القرآن بالخط العثماني
2. التلاوات الصوتية مع دعم القراء المتعددين
3. برامج الختمة
4. الآية اليومية
5. المحاضرات الإسلامية
6. المفضلات
7. البحث في القرآن
8. التفسير
```

---

## الملفات الأصلية للتحليل | Original Analysis Files

| File | Description |
|------|-------------|
| `reverse_analysis_input/apk_decoded/` | Decoded APK structure |
| `reverse_analysis_input/apk_raw/` | Raw APK files |
| `reverse_analysis_input/jadx_out/` | JADX decompiled output |
| `reverse_analysis_input/notes/` | Database dumps and schema |
| `Huda_Allah.0.1.13_sm.zip.*` | Smali files (4 parts) |
| `main_db@2.zip` | Compressed database |

---

## API Configuration (Confirmed)

| Property | Value |
|----------|-------|
| Base URL | `https://hudaallah.tabsera.ye/app_services/` |
| Contact | `info@tabsera.com.ye` |
| Auth Method | Bearer Token |
| Package | `com.example.hqp_mobile_app` |

---

## ملاحظات مهمة | Important Notes

1. **الهدف تعليمي**: هذا التحليل لغرض التعلم وبناء تطبيقات مشابهة بطريقة مشروعة
2. **لا نسخ للكود**: لا تنسخ الكود المصدري الأصلي - استخدم التحليل كمرجع
3. **التحقق من المحتوى**: تحقق من صحة المحتوى القرآني والتلاوات
4. **التراخيص**: احصل على تراخيص الخطوط القرآنية

---

## Source Links

- Original APK (MD): https://tabsera.com.ye/download/version/md
- Original APK (SM): https://tabsera.com.ye/download/version/sm

---

*تم إنشاء هذا التحليل لغرض تعليمي.*
*This analysis was created for educational purposes.*
