# Database Schema - Huda Allah Application

## Overview

The application uses a comprehensive SQLite database with 40 tables organized into functional domains. The database is managed using Drift ORM (formerly Moor) with reactive queries and type-safe access.

---

## Table Categories

### 1. Core Quran Tables

#### quran_surah
Stores the 114 chapters (surahs) of the Quran.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| juz_id | BIGINT FK | Reference to starting juz |
| page_id | BIGINT FK | Reference to starting page |
| fall_order | INTEGER | Revelation order |
| moshaf_order | INTEGER | Quran order (1-114) |
| ayahs_count | INTEGER | Number of verses |
| fall_place | INTEGER | 0=Meccan, 1=Medinan |
| title | VARCHAR(50) | Surah name in Arabic |
| names | TEXT | Alternative names (JSON) |
| info | TEXT | Surah description |
| symbol | VARCHAR(5) | Surah abbreviation |
| start_ayah_order | INTEGER | First ayah order |

#### quran_ayah
Stores all 6,236 verses of the Quran.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| surah_id | BIGINT FK | Reference to surah |
| juz_id | BIGINT FK | Reference to juz |
| hizb_id | BIGINT FK | Reference to hizb |
| page_id | BIGINT FK | Reference to page |
| hizb_number | INTEGER | Hizb number |
| ayah_order | INTEGER | Sequential order |
| ayah_number | INTEGER | Verse number within surah |
| is_start_hizb | BOOL | Marks hizb start |
| is_start_juz | BOOL | Marks juz start |
| has_prostration | BOOL | Contains prostration |
| prostration_type | INTEGER | Type of prostration |
| plain_text | TEXT | Plain Arabic text |
| quran_text | TEXT | Text with diacritics |
| stem | TEXT | Root word for search |

#### quran_page
Stores the 604 pages of the Quran manuscript.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| start_surah_id | BIGINT FK | First surah on page |
| start_juz_id | BIGINT FK | Juz reference |
| start_hizb_id | BIGINT FK | Hizb reference |
| hizb_number | INTEGER | Hizb number |
| page_number | INTEGER | Page number (1-604) |
| start_ayah_number | INTEGER | First ayah number |
| start_ayah_order | INTEGER | First ayah order |

#### quran_juz
Stores the 30 parts (juz) of the Quran.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| start_surah_id | BIGINT FK | Starting surah |
| start_page_id | BIGINT FK | Starting page |
| juz_number | INTEGER | Juz number (1-30) |
| start_ayah_number | INTEGER | Starting ayah |
| first_ayahs | TEXT | First verses text |
| start_ayah_order | INTEGER | Starting order |

#### quran_hizb
Stores the 240 hizb quarters (each juz has 8 quarters).

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| juz_id | BIGINT FK | Parent juz |
| surah_id | BIGINT FK | Starting surah |
| start_page_id | BIGINT FK | Starting page |
| hizb_number | INTEGER | Hizb number (1-60) |
| segment_order | INTEGER | Quarter position (1-4) |
| ayah_number | INTEGER | Starting ayah |
| first_ayahs | TEXT | First verses |
| start_ayah_order | INTEGER | Starting order |
| approval_status | INTEGER | Content approval |

**Constraints:**
- `segment_order` must be between 1 and 4
- Unique combination of `hizb_number` and `segment_order`

#### quran_glyph
Stores individual character positions for precise display.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| code | INTEGER | Character code |
| ayah_id | BIGINT FK | Parent ayah |
| ayah_number | INTEGER | Verse number |
| ayah_order | INTEGER | Order in surah |
| surah_id | BIGINT FK | Parent surah |
| page_id | BIGINT FK | Page reference |
| line_number | INTEGER | Line on page |
| glyph_type_id | BIGINT FK | Glyph type |
| hizb_id | BIGINT FK | Hizb reference |
| juz_id | BIGINT FK | Juz reference |
| hizb_number | INTEGER | Hizb number |
| has_prostration | INTEGER | Prostration flag |
| prostration_type | INTEGER | Prostration type |

#### quran_glyphtype
Classification of glyph types.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| name | VARCHAR(50) | Type name |
| parent_id | BIGINT FK | Parent type reference |

---

### 2. Recitation & Audio Tables

#### quran_reciter
Stores reciter profiles.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| deleted_at | DATETIME | Soft delete timestamp |
| created_at | DATETIME | Creation timestamp |
| updated_at | DATETIME | Update timestamp |
| name | TEXT | Reciter name |
| is_complete | BOOL | Complete profile flag |
| approval_status | INTEGER | Content approval |
| country_id | BIGINT FK | Country reference |
| profile | VARCHAR(100) | Profile image path |

#### quran_recitation
Stores recitation styles.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| deleted_at | DATETIME | Soft delete timestamp |
| created_at | DATETIME | Creation timestamp |
| updated_at | DATETIME | Update timestamp |
| name | VARCHAR(50) | Recitation name (e.g., "Hafs", "Warsh") |
| is_active | BOOL | Active flag |

#### quran_recitertype
Links reciters to their available recitations.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| deleted_at | DATETIME | Soft delete timestamp |
| created_at | DATETIME | Creation timestamp |
| updated_at | DATETIME | Update timestamp |
| reciter_id | BIGINT FK | Reciter reference |
| recitation_id | BIGINT FK | Recitation reference |
| approval_status | INTEGER | Content approval |

**Unique Index:** `unique_active_reciter_with_recitation` on (reciter_id, recitation_id) WHERE deleted_at IS NULL

#### quran_reciteraudio
Stores surah-level audio files.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| deleted_at | DATETIME | Soft delete timestamp |
| created_at | DATETIME | Creation timestamp |
| updated_at | DATETIME | Update timestamp |
| reciter_id | BIGINT FK | Reciter reference |
| surah_id | BIGINT FK | Surah reference |
| reciter_type_id | BIGINT FK | Reciter type reference |
| audio | VARCHAR(100) | Audio file path |
| approval_status | INTEGER | Content approval |
| is_complete | BOOL | Complete surah flag |

#### quran_ayahaudio
Stores ayah-level timing data for gapless playback.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| deleted_at | DATETIME | Soft delete timestamp |
| created_at | DATETIME | Creation timestamp |
| updated_at | DATETIME | Update timestamp |
| reciter_audio_id | BIGINT FK | Parent audio file |
| reciter_id | BIGINT FK | Reciter reference |
| surah_id | BIGINT FK | Surah reference |
| ayah_id | BIGINT FK | Ayah reference |
| ayah_order | INTEGER | Order in surah |
| reciter_type_id | BIGINT FK | Reciter type reference |
| audio | VARCHAR(100) | Audio file path (optional) |
| start_time | BIGINT | Start time in milliseconds |
| end_time | BIGINT | End time in milliseconds |

**Audio Path Format:** `db/quran/reciter/{reciter_id}/recitations/{recitation_id}/ayahs/{surah_id}-{ayah_number}.mp3`

---

### 3. Wiki & Lecture Tables

#### quran_wiki_lecturer
Stores lecturer profiles.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| deleted_at | DATETIME | Soft delete timestamp |
| created_at | DATETIME | Creation timestamp |
| updated_at | DATETIME | Update timestamp |
| name | TEXT | Short name |
| full_name | TEXT | Full name |
| profile | VARCHAR(100) | Profile image path |
| code | TEXT | Unique identifier |
| approval_status | INTEGER | Content approval |
| is_complete | BOOL | Complete profile flag |

**Unique Indexes:**
- `unique_active_lecturer_name` on (name) WHERE deleted_at IS NULL
- `unique_active_lecturer_code` on (code) WHERE deleted_at IS NULL

#### quran_wiki_lecturertype
Classification of lecturer types.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| deleted_at | DATETIME | Soft delete timestamp |
| created_at | DATETIME | Creation timestamp |
| updated_at | DATETIME | Update timestamp |
| display_name | TEXT | Display name |
| code | TEXT | Type code |

**Unique Index:** `unique_active_lecturer_type_code` on (code) WHERE deleted_at IS NULL

#### quran_wiki_lecturer_types
Many-to-many relationship between lecturers and types.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| lecturer_id | BIGINT FK | Lecturer reference |
| lecturertype_id | BIGINT FK | Type reference |

#### quran_wiki_lecture
Stores lecture metadata.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| deleted_at | DATETIME | Soft delete timestamp |
| created_at | DATETIME | Creation timestamp |
| updated_at | DATETIME | Update timestamp |
| title | TEXT | Lecture title |
| keywords | TEXT | Search keywords |
| short_content | TEXT | Summary/excerpt |
| date | DATE | Publication date |
| ordr | INTEGER | Display order |
| cover | VARCHAR(100) | Cover image path |
| views | BIGINT | View count |
| approval_status | INTEGER | Content approval |
| is_complete | BOOL | Complete content flag |
| lecturer_id | BIGINT FK | Lecturer reference |
| album_id | BIGINT FK | Album reference |

#### quran_wiki_paragraph
Stores structured lecture content.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| deleted_at | DATETIME | Soft delete timestamp |
| created_at | DATETIME | Creation timestamp |
| updated_at | DATETIME | Update timestamp |
| lecture_id | BIGINT FK | Lecture reference |
| title | TEXT | Paragraph title |
| ordr | INTEGER | Order in lecture |
| formatted_content | TEXT | HTML formatted content |
| content | TEXT | Raw content |
| plain_content | TEXT | Plain text for search |
| start_page_number | INTEGER | Reference page |
| approval_status | INTEGER | Content approval |

#### quran_wiki_media
Stores media attachments.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| deleted_at | DATETIME | Soft delete timestamp |
| created_at | DATETIME | Creation timestamp |
| updated_at | DATETIME | Update timestamp |
| name | TEXT | Media name |
| media | VARCHAR(100) | Media file path |
| approval_status | INTEGER | Content approval |
| album_id | BIGINT FK | Album reference |
| lecture_id | BIGINT FK | Lecture reference |
| media_type_id | BIGINT FK | Type reference |

#### quran_wiki_mediatype
Classification of media types.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| deleted_at | DATETIME | Soft delete timestamp |
| created_at | DATETIME | Creation timestamp |
| updated_at | DATETIME | Update timestamp |
| name | TEXT | Type name (e.g., "Audio", "Video", "Image", "Document") |
| extensions | TEXT | Allowed file extensions |
| code | TEXT | Type code |

#### quran_wiki_paragraphmedia
Links media to paragraph timestamps.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| deleted_at | DATETIME | Soft delete timestamp |
| created_at | DATETIME | Creation timestamp |
| updated_at | DATETIME | Update timestamp |
| start_at | BIGINT | Start time (ms) |
| end_at | BIGINT | End time (ms) |
| approval_status | INTEGER | Content approval |
| media_id | BIGINT FK | Media reference |
| paragraph_id | BIGINT FK | Paragraph reference |

#### quran_wiki_album
Stores album/collection metadata.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| deleted_at | DATETIME | Soft delete timestamp |
| created_at | DATETIME | Creation timestamp |
| updated_at | DATETIME | Update timestamp |
| name | TEXT | Album name |
| ordr | INTEGER | Display order |
| cover | VARCHAR(100) | Cover image path |
| is_active | BOOL | Active flag |
| lecturer_id | BIGINT FK | Lecturer reference |
| lecturer_type_id | BIGINT FK | Type reference |
| album_id | BIGINT FK | Parent album (nested albums) |

#### quran_wiki_lecturegroup
Stores lecture groups/playlists.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| deleted_at | DATETIME | Soft delete timestamp |
| created_at | DATETIME | Creation timestamp |
| updated_at | DATETIME | Update timestamp |
| name | TEXT | Group name |
| ordr | INTEGER | Display order |
| cover | VARCHAR(100) | Cover image path |
| lecturer_id | BIGINT FK | Lecturer reference |
| lecture_group_id | BIGINT FK | Parent group |
| lecture_ui_id | BIGINT FK | UI template reference |

#### quran_wiki_lecturegrouplecture
Links lectures to groups.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| created_at | DATETIME | Creation timestamp |
| updated_at | DATETIME | Update timestamp |
| lecture_group_id | BIGINT FK | Group reference |
| lecture_id | BIGINT FK | Lecture reference |
| ordr | INTEGER | Order in group |

#### quran_wiki_lectureinfo
Stores lecture metadata attributes.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| deleted_at | DATETIME | Soft delete timestamp |
| created_at | DATETIME | Creation timestamp |
| updated_at | DATETIME | Update timestamp |
| value | TEXT | Info value |
| approval_status | INTEGER | Content approval |
| lecture_id | BIGINT FK | Lecture reference |
| lecture_info_type_id | BIGINT FK | Info type reference |

#### quran_wiki_lectureinfotype
Classification of lecture info types.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| deleted_at | DATETIME | Soft delete timestamp |
| created_at | DATETIME | Creation timestamp |
| updated_at | DATETIME | Update timestamp |
| name | TEXT | Info type name |
| code | TEXT | Type code |

#### quran_wiki_lectureui
UI templates for lectures.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| deleted_at | DATETIME | Soft delete timestamp |
| created_at | DATETIME | Creation timestamp |
| updated_at | DATETIME | Update timestamp |
| code | VARCHAR(50) | Template code |
| name | VARCHAR(50) | Template name |
| cover | VARCHAR(100) | Preview image |
| description | TEXT | Template description |
| is_active | BOOL | Active flag |

#### quran_wiki_personalinfo
Lecturer personal information.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| deleted_at | DATETIME | Soft delete timestamp |
| created_at | DATETIME | Creation timestamp |
| updated_at | DATETIME | Update timestamp |
| value | TEXT | Info value |
| approval_status | INTEGER | Content approval |
| lecturer_id | BIGINT FK | Lecturer reference |
| personal_info_type_id | BIGINT FK | Info type reference |

#### quran_wiki_personalinfotype
Classification of personal info types.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| deleted_at | DATETIME | Soft delete timestamp |
| created_at | DATETIME | Creation timestamp |
| updated_at | DATETIME | Update timestamp |
| name | TEXT | Info type name |
| has_media | BOOL | Supports media attachment |

#### quran_wiki_personalmedia
Media for personal information.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| deleted_at | DATETIME | Soft delete timestamp |
| created_at | DATETIME | Creation timestamp |
| updated_at | DATETIME | Update timestamp |
| name | TEXT | Media name |
| media | VARCHAR(100) | Media file path |
| dat | VARCHAR(100) | Date/metadata |
| approval_status | INTEGER | Content approval |
| personal_info_id | BIGINT FK | Personal info reference |
| media_type_id | BIGINT FK | Type reference |

#### quran_wiki_tag
Content tags.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| deleted_at | DATETIME | Soft delete timestamp |
| created_at | DATETIME | Creation timestamp |
| updated_at | DATETIME | Update timestamp |
| name | TEXT | Tag name |

**Unique Index:** `unique_active_tag_name` on (name) WHERE deleted_at IS NULL

#### quran_wiki_tag_lectures
Many-to-many relationship between tags and lectures.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| tag_id | BIGINT FK | Tag reference |
| lecture_id | BIGINT FK | Lecture reference |

#### quran_wiki_textlink
Cross-reference links in content.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| deleted_at | DATETIME | Soft delete timestamp |
| created_at | DATETIME | Creation timestamp |
| updated_at | DATETIME | Update timestamp |
| text | TEXT | Link text |
| hint | TEXT | Tooltip/hint |
| table_name | TEXT | Target table |
| approval_status | INTEGER | Content approval |
| paragraph_id | BIGINT FK | Paragraph reference |
| table_record_id | BIGINT | Target record ID |

---

### 4. Reading Programs Tables

#### reading_program_readingprogram
Stores reading program definitions.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| cover | VARCHAR(100) | Cover image path |
| name | TEXT | Program name |
| reminder_time | TIME | Daily reminder time |
| start_date | DATE | Program start date |
| approval_status | INTEGER | Content approval |
| is_complete | BOOL | Complete program flag |
| publish_date | DATETIME | Publication date |

#### reading_program_readingday
Stores reading days for programs.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| program_id | BIGINT FK | Program reference |
| date | DATE | Reading date |

#### reading_program_readingtask
Stores reading tasks.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| program_id | BIGINT FK | Program reference |
| name | TEXT | Task name |
| task_type_id | BIGINT FK | Task type reference |
| ordr | INTEGER | Task order |

#### reading_program_readingtasktype
Classification of reading task types.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| name | TEXT | Type name |
| table_name | TEXT | Target table for reading |
| filter_field | TEXT | Field to filter by |

#### reading_program_readingtaskunit
Stores individual reading units.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| task_id | BIGINT FK | Task reference |
| day_id | BIGINT FK | Day reference |
| from_record_id | BIGINT | Starting record |
| to_record_id | BIGINT | Ending record |
| from_text | TEXT | Starting text snippet |
| to_text | TEXT | Ending text snippet |
| from_parent_title | TEXT | Starting parent title |
| to_parent_title | TEXT | Ending parent title |

---

### 5. Common/Reference Tables

#### common_services_country
Country reference data.

| Column | Type | Description |
|--------|------|-------------|
| id | INTEGER PK | Auto-increment primary key |
| iso | VARCHAR(2) | ISO 2-letter code |
| name | VARCHAR(80) | Country name |
| nicename | VARCHAR(80) | Display name |
| iso3 | VARCHAR(3) | ISO 3-letter code |
| numcode | SMALLINT | Numeric code |
| phonecode | INTEGER | Phone prefix |

---

## Entity Relationship Diagram

```
quran_surah ────┬─── quran_ayah ─────── quran_glyph
                │         │
                │         ├─── quran_ayahaudio
                │         │
                │         └─── quran_page
                │
                ├─── quran_juz ──────── quran_hizb
                │
                └─── quran_reciteraudio
                            │
quran_reciter ─── quran_recitertype ─── quran_recitation
                            │
                            └─── quran_ayahaudio

quran_wiki_lecturer ───┬─── quran_wiki_lecture ──── quran_wiki_paragraph
                       │           │                        │
                       │           ├─── quran_wiki_media    │
                       │           │                        │
                       │           ├─── quran_wiki_tag      │
                       │           │      (via junction)    │
                       │           │                        │
                       │           └─── quran_wiki_lecturegroup
                       │                      │
                       └─── quran_wiki_album ─┘

reading_program_readingprogram ───┬─── reading_program_readingday
                                  │
                                  └─── reading_program_readingtask ─── reading_program_readingtaskunit
```

---

## Indexes Summary

| Table | Index Name | Columns | Type |
|-------|------------|---------|------|
| quran_recitertype | unique_active_reciter_with_recitation | reciter_id, recitation_id | Unique (partial) |
| quran_wiki_lecturer | unique_active_lecturer_name | name | Unique (partial) |
| quran_wiki_lecturer | unique_active_lecturer_code | code | Unique (partial) |
| quran_wiki_lecturertype | unique_active_lecturer_type_code | code | Unique (partial) |
| quran_wiki_lectureinfotype | unique_active_lecture_info_type_name | name | Unique (partial) |
| quran_wiki_lectureinfotype | unique_active_lecture_info_code | code | Unique (partial) |
| quran_wiki_lectureui | unique_active_code | code | Unique (partial) |
| quran_wiki_mediatype | unique_active_media_type_name | name | Unique (partial) |
| quran_wiki_mediatype | unique_active_media_type_code | code | Unique (partial) |
| quran_wiki_personalinfotype | unique_active_personal_info_type_name | name | Unique (partial) |
| quran_wiki_tag | unique_active_tag_name | name | Unique (partial) |

---

## Sample Data Examples

### Quran Ayah Audio Record
```sql
INSERT INTO quran_ayahaudio VALUES(
  33,                                    -- id
  NULL,                                  -- deleted_at
  '2025-08-12T14:56:21.419572+00:00',   -- created_at
  '2026-01-11T11:40:10.436655+00:00',   -- updated_at
  571,                                   -- reciter_audio_id
  1,                                     -- reciter_id
  1,                                     -- surah_id
  1,                                     -- ayah_id
  1,                                     -- ayah_order
  6,                                     -- reciter_type_id
  'db/quran/reciter/1/recitations/2/ayahs/1-1.mp3', -- audio path
  600,                                   -- start_time (ms)
  12290                                  -- end_time (ms)
);
```

This database schema provides a robust foundation for a comprehensive Quran application with support for multiple recitations, structured content, and personalized reading programs.
