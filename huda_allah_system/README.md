# هدى الله - Huda Allah System
# نظام قرآني شامل - Quran Application System

## 📁 Monorepo Structure

```
huda_allah_system/
├── apps/
│   ├── mobile/          # Flutter Mobile App
│   ├── admin/           # Next.js Admin Dashboard
│   └── backend/         # NestJS Backend API
├── packages/
│   ├── shared-types/    # Shared TypeScript types
│   ├── database/        # Database schema & utilities
│   └── ui-components/   # Shared UI components
├── database/            # SQLite database files
├── mobile_assets/       # Flutter assets (fonts, images)
├── scripts/             # Build & utility scripts
└── tools/               # Development tools
```

## 🚀 Quick Start

### Prerequisites
- Node.js 18+
- Flutter 3.19+
- Python 3.10+

### Backend Setup
```bash
cd apps/backend
npm install
npm run start:dev
```

### Admin Dashboard Setup
```bash
cd apps/admin
npm install
npm run dev
```

### Mobile App Setup
```bash
cd apps/mobile
flutter pub get
flutter run
```

## 📊 Database

The system uses SQLite with the following main entities:

### Quran Module
- 114 Surahs
- 6,348 Ayahs
- 604 Pages
- 30 Juzs
- 240 Hizbs

### Audio Module
- 3 Reciters
- 3 Recitation types
- 690 Surah audio files
- 49,387 Ayah audio segments

### Wiki/Lectures Module
- 8 Lecturers
- 681 Lectures
- 36,668 Paragraphs
- 78 Lecture Groups
- 4,036 Tags

## 🛠 Tech Stack

| Component | Technology |
|-----------|------------|
| Mobile | Flutter 3.19+ |
| Admin | Next.js 14 + TypeScript |
| Backend | NestJS + TypeScript |
| Database | SQLite (original) / PostgreSQL (production) |
| ORM | Prisma / Drift |
| State | BLoC / Cubit |

## 📝 License

Educational and development purposes.
