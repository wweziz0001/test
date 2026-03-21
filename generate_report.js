const { Document, Packer, Paragraph, TextRun, Table, TableRow, TableCell, Header, Footer, 
        AlignmentType, PageOrientation, LevelFormat, HeadingLevel, BorderStyle, WidthType, 
        ShadingType, VerticalAlign, PageNumber, PageBreak, TableOfContents } = require('docx');
const fs = require('fs');

// Color scheme - Midnight Code (Technical)
const colors = {
  primary: "020617",
  body: "1E293B",
  secondary: "64748B",
  accent: "94A3B8",
  tableBg: "F8FAFC"
};

const tableBorder = { style: BorderStyle.SINGLE, size: 1, color: colors.secondary };
const cellBorders = { top: tableBorder, bottom: tableBorder, left: tableBorder, right: tableBorder };

// Create the document
const doc = new Document({
  styles: {
    default: { document: { run: { font: "Times New Roman", size: 24 } } },
    paragraphStyles: [
      { id: "Title", name: "Title", basedOn: "Normal",
        run: { size: 56, bold: true, color: colors.primary, font: "Times New Roman" },
        paragraph: { spacing: { before: 240, after: 120 }, alignment: AlignmentType.CENTER } },
      { id: "Heading1", name: "Heading 1", basedOn: "Normal", next: "Normal", quickFormat: true,
        run: { size: 36, bold: true, color: colors.primary, font: "Times New Roman" },
        paragraph: { spacing: { before: 400, after: 200 }, outlineLevel: 0 } },
      { id: "Heading2", name: "Heading 2", basedOn: "Normal", next: "Normal", quickFormat: true,
        run: { size: 28, bold: true, color: colors.body, font: "Times New Roman" },
        paragraph: { spacing: { before: 300, after: 150 }, outlineLevel: 1 } },
      { id: "Heading3", name: "Heading 3", basedOn: "Normal", next: "Normal", quickFormat: true,
        run: { size: 24, bold: true, color: colors.secondary, font: "Times New Roman" },
        paragraph: { spacing: { before: 200, after: 100 }, outlineLevel: 2 } }
    ]
  },
  numbering: {
    config: [
      { reference: "bullet-list",
        levels: [{ level: 0, format: LevelFormat.BULLET, text: "•", alignment: AlignmentType.LEFT,
          style: { paragraph: { indent: { left: 720, hanging: 360 } } } }] },
      { reference: "numbered-list",
        levels: [{ level: 0, format: LevelFormat.DECIMAL, text: "%1.", alignment: AlignmentType.LEFT,
          style: { paragraph: { indent: { left: 720, hanging: 360 } } } }] }
    ]
  },
  sections: [{
    properties: {
      page: {
        margin: { top: 1440, right: 1440, bottom: 1440, left: 1440 },
        size: { orientation: PageOrientation.PORTRAIT }
      }
    },
    headers: {
      default: new Header({ children: [new Paragraph({ 
        alignment: AlignmentType.RIGHT,
        children: [new TextRun({ text: "Huda Allah App - Reverse Engineering Analysis Report", size: 18, color: colors.secondary })]
      })] })
    },
    footers: {
      default: new Footer({ children: [new Paragraph({ 
        alignment: AlignmentType.CENTER,
        children: [
          new TextRun({ text: "Page ", size: 18 }), 
          new TextRun({ children: [PageNumber.CURRENT], size: 18 }), 
          new TextRun({ text: " / ", size: 18 }), 
          new TextRun({ children: [PageNumber.TOTAL_PAGES], size: 18 })
        ]
      })] })
    },
    children: [
      // Cover Page
      new Paragraph({ spacing: { before: 3000 }, children: [] }),
      new Paragraph({
        alignment: AlignmentType.CENTER,
        children: [new TextRun({ text: "Reverse Engineering Analysis Report", size: 72, bold: true, color: colors.primary })]
      }),
      new Paragraph({ spacing: { before: 400 }, alignment: AlignmentType.CENTER,
        children: [new TextRun({ text: "Huda Allah - Quran Application", size: 48, color: colors.body })]
      }),
      new Paragraph({ spacing: { before: 800 }, alignment: AlignmentType.CENTER,
        children: [new TextRun({ text: "Version 0.1.13", size: 28, color: colors.secondary })]
      }),
      new Paragraph({ spacing: { before: 200 }, alignment: AlignmentType.CENTER,
        children: [new TextRun({ text: "Package: com.example.hqp_mobile_app", size: 24, color: colors.secondary })]
      }),
      new Paragraph({ spacing: { before: 1500 }, alignment: AlignmentType.CENTER,
        children: [new TextRun({ text: "Comprehensive Technical Documentation", size: 28, color: colors.accent })]
      }),
      new Paragraph({ spacing: { before: 200 }, alignment: AlignmentType.CENTER,
        children: [new TextRun({ text: "Architecture | Features | Data Model | API Surface", size: 22, color: colors.accent })]
      }),
      new Paragraph({ spacing: { before: 2000 }, alignment: AlignmentType.CENTER,
        children: [new TextRun({ text: "Date: March 22, 2026", size: 24, color: colors.secondary })]
      }),
      
      // Page break after cover
      new Paragraph({ children: [new PageBreak()] }),
      
      // Table of Contents
      new Paragraph({ heading: HeadingLevel.HEADING_1, children: [new TextRun("Table of Contents")] }),
      new TableOfContents("Table of Contents", { hyperlink: true, headingStyleRange: "1-3" }),
      new Paragraph({ 
        alignment: AlignmentType.CENTER,
        spacing: { before: 200 },
        children: [new TextRun({ text: "Note: Right-click the TOC and select 'Update Field' to refresh page numbers.", size: 18, color: "999999" })]
      }),
      
      // Page break after TOC
      new Paragraph({ children: [new PageBreak()] }),
      
      // 1. Executive Summary
      new Paragraph({ heading: HeadingLevel.HEADING_1, children: [new TextRun("1. Executive Summary")] }),
      new Paragraph({
        spacing: { after: 150 },
        children: [new TextRun({ text: "This report presents a comprehensive reverse engineering analysis of the \"Huda Allah\" (هدى الله) mobile application, a feature-rich Quran application built using Flutter framework. The analysis covers the application's architecture, features, data model, API surface, and technical implementation details extracted through systematic examination of the APK's decompiled sources, native libraries, assets, and database schema.", size: 24 })]
      }),
      new Paragraph({
        spacing: { after: 150 },
        children: [new TextRun({ text: "The application represents a sophisticated Islamic content platform that combines Quran reading, audio recitations, lecture delivery, reading programs, and daily spiritual content into a unified mobile experience. The technical implementation demonstrates modern Flutter development practices with clean architecture principles, BLoC state management, and offline-first data strategies.", size: 24 })]
      }),
      
      // Key Findings Summary Table
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("Key Findings Summary")] }),
      new Table({
        columnWidths: [3000, 6360],
        margins: { top: 100, bottom: 100, left: 180, right: 180 },
        rows: [
          new TableRow({
            tableHeader: true,
            children: [
              new TableCell({ borders: cellBorders, width: { size: 3000, type: WidthType.DXA },
                shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, verticalAlign: VerticalAlign.CENTER,
                children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Aspect", bold: true, size: 22 })] })] }),
              new TableCell({ borders: cellBorders, width: { size: 6360, type: WidthType.DXA },
                shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, verticalAlign: VerticalAlign.CENTER,
                children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Finding", bold: true, size: 22 })] })] })
            ]
          }),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, width: { size: 3000, type: WidthType.DXA }, children: [new Paragraph({ children: [new TextRun({ text: "Technology Stack", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, width: { size: 6360, type: WidthType.DXA }, children: [new Paragraph({ children: [new TextRun({ text: "Flutter 3.x, Dart, Drift ORM, SQLite, BLoC/Cubit, GetIt DI", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, width: { size: 3000, type: WidthType.DXA }, children: [new Paragraph({ children: [new TextRun({ text: "Architecture", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, width: { size: 6360, type: WidthType.DXA }, children: [new Paragraph({ children: [new TextRun({ text: "Clean Architecture with Domain/Data/Presentation layers", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, width: { size: 3000, type: WidthType.DXA }, children: [new Paragraph({ children: [new TextRun({ text: "Primary Domain", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, width: { size: 6360, type: WidthType.DXA }, children: [new Paragraph({ children: [new TextRun({ text: "Islamic content: Quran, Recitations, Lectures, Reading Programs", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, width: { size: 3000, type: WidthType.DXA }, children: [new Paragraph({ children: [new TextRun({ text: "API Endpoint", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, width: { size: 6360, type: WidthType.DXA }, children: [new Paragraph({ children: [new TextRun({ text: "https://hudaallah.tabsera.ye/app_services/", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, width: { size: 3000, type: WidthType.DXA }, children: [new Paragraph({ children: [new TextRun({ text: "Features Count", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, width: { size: 6360, type: WidthType.DXA }, children: [new Paragraph({ children: [new TextRun({ text: "37+ distinct feature modules identified", size: 22 })] })] })
          ]})
        ]
      }),
      
      // 2. Technology Stack
      new Paragraph({ heading: HeadingLevel.HEADING_1, children: [new TextRun("2. Detected Technology Stack")] }),
      new Paragraph({
        spacing: { after: 150 },
        children: [new TextRun({ text: "The application is built on a modern, well-architected technology stack that emphasizes cross-platform compatibility, offline functionality, and maintainable code organization. The following analysis details each layer of the technology stack and its role in the application architecture.", size: 24 })]
      }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("2.1 Core Framework")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Flutter Framework: Version 3.x with Dart programming language, providing cross-platform mobile development capabilities with native performance characteristics.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Impeller Disabled: The manifest indicates Impeller is disabled (io.flutter.embedding.android.EnableImpeller = false), suggesting reliance on Skia rendering backend.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Flutter Embedding Version 2: Modern embedding architecture for improved plugin compatibility and platform integration.", size: 24 })] }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("2.2 State Management")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "flutter_bloc: Primary state management solution implementing the BLoC (Business Logic Component) pattern with Cubit variants for simpler state scenarios.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "freezed: Code generation for immutable state classes with union types and pattern matching capabilities.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "GetIt: Service locator pattern implementation for dependency injection and inversion of control.", size: 24 })] }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("2.3 Data Persistence")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Drift (formerly Moor): Type-safe SQL database ORM with reactive queries and migrations support.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "SQLite3: Native database engine with custom libsqlite3.so library for enhanced performance.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "flutter_secure_storage: Secure credential storage for authentication tokens and sensitive data.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "datastore_shared_counter: Shared preferences with atomic counter operations for settings and preferences.", size: 24 })] }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("2.4 Network & API")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Dio: Powerful HTTP client with interceptors, timeout configuration, and request/response transformation.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "cached_network_image: Efficient image loading and caching with placeholder and error handling support.", size: 24 })] }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("2.5 Media & Audio")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "audio_service: Background audio playback with media controls, lock screen integration, and notification support.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "just_audio: Low-level audio player with gapless playback and streaming capabilities.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "video_player: Native video playback for lecture content and media presentations.", size: 24 })] }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("2.6 UI Components")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "cupertino_icons: iOS-style icon set for platform-appropriate design.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "font_awesome_flutter: Comprehensive icon library (Font Awesome 7) for extended iconography.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "hugeicons: Additional stroke-rounded icon set for modern UI aesthetics.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "flutter_widget_from_html_core: HTML content rendering with support for rich text formatting.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "extended_image: Advanced image handling with gestures, editing, and caching features.", size: 24 })] }),
      
      // 3. Android Native Layer
      new Paragraph({ heading: HeadingLevel.HEADING_1, children: [new TextRun("3. Android Native Layer Findings")] }),
      new Paragraph({
        spacing: { after: 150 },
        children: [new TextRun({ text: "The Android manifest and native layer reveal a carefully configured application with extensive background service support, media playback capabilities, and notification management. This section details the permissions, components, and integrations identified in the Android layer.", size: 24 })]
      }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("3.1 Application Identity")] }),
      new Table({
        columnWidths: [3000, 6360],
        margins: { top: 100, bottom: 100, left: 180, right: 180 },
        rows: [
          new TableRow({ tableHeader: true, children: [
            new TableCell({ borders: cellBorders, width: { size: 3000, type: WidthType.DXA }, shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Property", bold: true, size: 22 })] })] }),
            new TableCell({ borders: cellBorders, width: { size: 6360, type: WidthType.DXA }, shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Value", bold: true, size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Package Name", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "com.example.hqp_mobile_app", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "App Label", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "هدى الله (Huda Allah)", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Compile SDK", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "36 (Android 16)", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Flutter Embedding", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Version 2", size: 22 })] })] })
          ]})
        ]
      }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("3.2 Permissions Analysis")] }),
      new Paragraph({
        spacing: { after: 100 },
        children: [new TextRun({ text: "The application requests a focused set of permissions aligned with its core functionality of media playback, content download, and user notifications:", size: 24 })]
      }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "INTERNET: Required for API communication, content streaming, and data synchronization with backend services.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "WAKE_LOCK: Essential for maintaining audio playback during screen-off states and background processing.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "FOREGROUND_SERVICE + FOREGROUND_SERVICE_MEDIA_PLAYBACK: Enables persistent audio playback service with proper Android 14+ compliance.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "POST_NOTIFICATIONS: Required for Android 13+ notification display, supporting daily ayah reminders and program notifications.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "RECEIVE_BOOT_COMPLETED: Allows automatic rescheduling of notifications after device restart.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "VIBRATE: Provides haptic feedback for user interactions.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "ACCESS_NETWORK_STATE: Enables connectivity-aware content downloading and offline mode detection.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "READ_MEDIA_AUDIO/VIDEO/IMAGES: Scoped storage permissions for media content access on Android 13+.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "READ_EXTERNAL_STORAGE (maxSdkVersion=32): Legacy storage access for older Android versions.", size: 24 })] }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("3.3 Core Components")] }),
      new Paragraph({ heading: HeadingLevel.HEADING_3, children: [new TextRun("Activities")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "AudioServiceActivity: Main entry point with LAUNCHER intent filter, handles audio service integration and launch theme configuration.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "WebViewActivity: In-app browser for external content viewing with fullscreen theme.", size: 24 })] }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_3, children: [new TextRun("Services")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "AudioService: Foreground service with mediaPlayback type, implements MediaBrowserService for system media integration.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "WorkManagerTaskService: Background task execution using Android WorkManager for scheduled operations.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "SystemJobService: System-level job scheduling for battery-optimized background tasks.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "SystemForegroundService: Foreground task execution for long-running operations.", size: 24 })] }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_3, children: [new TextRun("Receivers")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "ScheduledNotificationReceiver: Handles scheduled notification triggers for daily ayah and program reminders.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "ScheduledNotificationBootReceiver: Reschedules notifications after device boot completion.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "MediaButtonReceiver: Handles hardware media button events for playback control.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "DownloadedReceiver: Manages download completion events from flutter_downloader.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "WorkManagerBroadcastReceiver: Coordinates WorkManager task lifecycle events.", size: 24 })] }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_3, children: [new TextRun("Providers")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "ShareFileProvider: Enables secure file sharing between applications via content URIs.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "FileProvider (open_file): Supports opening downloaded content with external applications.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "InitializationProvider: AndroidX startup initialization for lifecycle and work manager components.", size: 24 })] }),
      
      // 4. Flutter Assets Analysis
      new Paragraph({ heading: HeadingLevel.HEADING_1, children: [new TextRun("4. Flutter Layer & Assets Findings")] }),
      new Paragraph({
        spacing: { after: 150 },
        children: [new TextRun({ text: "The Flutter layer encompasses the application's presentation logic, UI components, and asset resources. Analysis of the decompiled sources and asset manifest reveals a sophisticated multi-feature application with strong emphasis on Quran content delivery and Islamic educational material.", size: 24 })]
      }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("4.1 Font Resources")] }),
      new Paragraph({
        spacing: { after: 100 },
        children: [new TextRun({ text: "The application uses a carefully selected set of Arabic-optimized fonts for Quranic text and UI elements:", size: 24 })]
      }),
      new Table({
        columnWidths: [2800, 6560],
        margins: { top: 100, bottom: 100, left: 180, right: 180 },
        rows: [
          new TableRow({ tableHeader: true, children: [
            new TableCell({ borders: cellBorders, width: { size: 2800, type: WidthType.DXA }, shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Font Family", bold: true, size: 22 })] })] }),
            new TableCell({ borders: cellBorders, width: { size: 6560, type: WidthType.DXA }, shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Purpose", bold: true, size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "UthmanicHafs", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Primary Quranic text font following Hafs narration style", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "QCF_BSML", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Basmalah decorative font for chapter openings", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "AbdoLine", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Decorative Arabic calligraphy for headings", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Newmalazim", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Custom Arabic numeral system for verse numbering", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "ElMessiri", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "UI text font with Regular, Medium, SemiBold, Bold variants", size: 22 })] })] })
          ]})
        ]
      }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("4.2 Image Assets")] }),
      new Paragraph({
        spacing: { after: 100 },
        children: [new TextRun({ text: "The asset manifest reveals a comprehensive visual identity system:", size: 24 })]
      }),
      new Paragraph({ heading: HeadingLevel.HEADING_3, children: [new TextRun("Quran Decorations")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "madani.svg / makki.svg: Surah origin indicators (Medinan/Meccan revelation)", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "surah_name.svg: Decorative surah title styling", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "page_header.svg / page_number.svg: Page layout decorations", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "hizb_*.png/svg: Hizb division markers (start, quarter, half, three-quarters)", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "initial_page_*.png: Page template decorations for light/dark themes", size: 24 })] }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_3, children: [new TextRun("Branding & Identity")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "primary_logo.png: Main application branding", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "quran_logo.png: Quran module specific branding", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "tabsera_logo.png: Developer/company branding", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "launcher_icon.png: Application launcher icon", size: 24 })] }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_3, children: [new TextRun("Functional Assets")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "reciter_default_profile.jpg: Default reciter avatar placeholder", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "decorated_splash_*.png: Splash screen decorations (head, body, tail)", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "container_1.png: UI container background", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "placeholder_*.png: Content placeholder images", size: 24 })] }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("4.3 Data Assets")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "main_db@2.zip: Compressed SQLite database containing pre-populated Quran data, reciter information, lecture content, and reading program configurations.", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "jathr_words.json: Arabic root word dictionary for advanced search functionality, enabling morphological search across Quranic text.", size: 24 })] }),
      
      // 5. Decompiled Source Analysis
      new Paragraph({ heading: HeadingLevel.HEADING_1, children: [new TextRun("5. Decompiled Source Architecture Analysis")] }),
      new Paragraph({
        spacing: { after: 150 },
        children: [new TextRun({ text: "Analysis of the decompiled Dart source code embedded in libapp.so reveals a sophisticated clean architecture implementation with clear separation of concerns across domain, data, and presentation layers.", size: 24 })]
      }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("5.1 Package Structure")] }),
      new Paragraph({
        spacing: { after: 100 },
        children: [new TextRun({ text: "The application follows a feature-first package organization under the main package hqp_mobile_app:", size: 24 })]
      }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "src/apps/quran/: Main application module containing all Quran-related features", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "src/features/: Cross-cutting features (auth, backup, db_updates, init, notification)", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "src/core/: Shared infrastructure (API client, database, widgets, settings)", size: 24 })] }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("5.2 Feature Modules Identified")] }),
      new Paragraph({
        spacing: { after: 100 },
        children: [new TextRun({ text: "A comprehensive feature map extracted from package paths reveals 37 distinct feature modules organized into functional categories:", size: 24 })]
      }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_3, children: [new TextRun("Quran Core Features")] }),
      new Table({
        columnWidths: [3500, 5860],
        margins: { top: 100, bottom: 100, left: 180, right: 180 },
        rows: [
          new TableRow({ tableHeader: true, children: [
            new TableCell({ borders: cellBorders, width: { size: 3500, type: WidthType.DXA }, shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Feature", bold: true, size: 22 })] })] }),
            new TableCell({ borders: cellBorders, width: { size: 5860, type: WidthType.DXA }, shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Description", bold: true, size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "quran_pages", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Page-by-page Quran display with navigation", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "quran_reading", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Reading mode with bookmark and progress tracking", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "quran_search", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Morphological search using root words dictionary", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "quran_interpretation", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Tafsir (interpretation) content display", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "quran_index", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Surah and Juz index navigation", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "quran_display_mode", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Font and display customization settings", size: 22 })] })] })
          ]})
        ]
      }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_3, children: [new TextRun("Audio Features")] }),
      new Table({
        columnWidths: [3500, 5860],
        margins: { top: 100, bottom: 100, left: 180, right: 180 },
        rows: [
          new TableRow({ tableHeader: true, children: [
            new TableCell({ borders: cellBorders, width: { size: 3500, type: WidthType.DXA }, shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Feature", bold: true, size: 22 })] })] }),
            new TableCell({ borders: cellBorders, width: { size: 5860, type: WidthType.DXA }, shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Description", bold: true, size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "quran_audio_player", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Main Quran recitation player with ayah-by-ayah playback", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "reciters", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Reciter selection and management with multiple recitations", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "quran_downloads", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Audio file download management for offline playback", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "media_audio_player", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Lecture audio player with media controls", size: 22 })] })] })
          ]})
        ]
      }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_3, children: [new TextRun("Lecture & Content Features")] }),
      new Table({
        columnWidths: [3500, 5860],
        margins: { top: 100, bottom: 100, left: 180, right: 180 },
        rows: [
          new TableRow({ tableHeader: true, children: [
            new TableCell({ borders: cellBorders, width: { size: 3500, type: WidthType.DXA }, shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Feature", bold: true, size: 22 })] })] }),
            new TableCell({ borders: cellBorders, width: { size: 5860, type: WidthType.DXA }, shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Description", bold: true, size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "quran_lectures", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Islamic lecture browsing and playback", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "lecture_paragraphs", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Structured lecture content with paragraphs and media", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "lecture_media", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Media attachments (images, videos, documents, audio)", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "lecture_search", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Full-text search across lecture content", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "lecture_stop_points", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Reading progress bookmarks for lectures", size: 22 })] })] })
          ]})
        ]
      }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_3, children: [new TextRun("Personal Features")] }),
      new Table({
        columnWidths: [3500, 5860],
        margins: { top: 100, bottom: 100, left: 180, right: 180 },
        rows: [
          new TableRow({ tableHeader: true, children: [
            new TableCell({ borders: cellBorders, width: { size: 3500, type: WidthType.DXA }, shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Feature", bold: true, size: 22 })] })] }),
            new TableCell({ borders: cellBorders, width: { size: 5860, type: WidthType.DXA }, shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Description", bold: true, size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "khitmahs", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Quran completion programs (khitmah) with daily quotas", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "reading_programs", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Structured reading programs with reminders", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "daily_ayah", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Daily verse notification and display", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "favorite_ayahs", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Bookmarked verses collection", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "favorite_lectures", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Bookmarked lectures collection", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "ayah_groups", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Custom verse groupings/collections", size: 22 })] })] })
          ]})
        ]
      }),
      
      // 6. Native Library Analysis
      new Paragraph({ heading: HeadingLevel.HEADING_1, children: [new TextRun("6. Native Library Analysis")] }),
      new Paragraph({
        spacing: { after: 150 },
        children: [new TextRun({ text: "The APK includes native libraries for three architectures (arm64-v8a, armeabi-v7a, x86_64), each containing the Flutter runtime and application-specific compiled code.", size: 24 })]
      }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("6.1 Library Inventory")] }),
      new Table({
        columnWidths: [2800, 6560],
        margins: { top: 100, bottom: 100, left: 180, right: 180 },
        rows: [
          new TableRow({ tableHeader: true, children: [
            new TableCell({ borders: cellBorders, width: { size: 2800, type: WidthType.DXA }, shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Library", bold: true, size: 22 })] })] }),
            new TableCell({ borders: cellBorders, width: { size: 6560, type: WidthType.DXA }, shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Purpose", bold: true, size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "libflutter.so", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Flutter engine with Skia rendering, Dart VM, and platform channels", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "libapp.so", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "AOT-compiled Dart application code with embedded strings and symbols", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "libsqlite3.so", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Custom SQLite build with FTS5 and enhanced performance", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "libdatastore_shared_counter.so", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Atomic counter operations for shared preferences", size: 22 })] })] })
          ]})
        ]
      }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("6.2 Key String Extracts")] }),
      new Paragraph({
        spacing: { after: 100 },
        children: [new TextRun({ text: "String extraction from libapp.so reveals important structural information about the application:", size: 24 })]
      }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_3, children: [new TextRun("API Configuration (CONFIRMED)")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Base URL: https://hudaallah.tabsera.ye/app_services/", size: 24, bold: true })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Contact: info@tabsera.com.ye", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Developer: Tabsera ( Yemen-based development company)", size: 24 })] }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_3, children: [new TextRun("Authentication Strings")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Bearer token authentication detected", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "accessToken / refreshToken lifecycle management", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "accessTokenExpiryDate / refreshTokenExpiryDate for session management", size: 24 })] }),
      
      // 7. Database Schema Analysis
      new Paragraph({ heading: HeadingLevel.HEADING_1, children: [new TextRun("7. Database Model Analysis")] }),
      new Paragraph({
        spacing: { after: 150 },
        children: [new TextRun({ text: "The application uses a comprehensive SQLite database schema with 40 tables organized into functional domains. The schema reveals a sophisticated content management system for Islamic educational material.", size: 24 })]
      }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("7.1 Core Quran Tables")] }),
      new Table({
        columnWidths: [2500, 6860],
        margins: { top: 100, bottom: 100, left: 180, right: 180 },
        rows: [
          new TableRow({ tableHeader: true, children: [
            new TableCell({ borders: cellBorders, width: { size: 2500, type: WidthType.DXA }, shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Table", bold: true, size: 22 })] })] }),
            new TableCell({ borders: cellBorders, width: { size: 6860, type: WidthType.DXA }, shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Purpose", bold: true, size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "quran_ayah", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "All 6,236 verses with text, position, prostration flags", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "quran_surah", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "114 chapters with titles, names, info, revelation place", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "quran_glyph", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Individual character positions for precise display", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "quran_page", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "604 pages with starting surah/ayah references", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "quran_juz", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "30 juz (parts) with start positions", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "quran_hizb", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "240 hizb quarters with segment positions", size: 22 })] })] })
          ]})
        ]
      }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("7.2 Audio & Recitation Tables")] }),
      new Table({
        columnWidths: [2500, 6860],
        margins: { top: 100, bottom: 100, left: 180, right: 180 },
        rows: [
          new TableRow({ tableHeader: true, children: [
            new TableCell({ borders: cellBorders, width: { size: 2500, type: WidthType.DXA }, shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Table", bold: true, size: 22 })] })] }),
            new TableCell({ borders: cellBorders, width: { size: 6860, type: WidthType.DXA }, shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Purpose", bold: true, size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "quran_reciter", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Reciter profiles with country, profile image", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "quran_recitertype", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Reciter-to-recitation mappings (multiple recitations per reciter)", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "quran_recitation", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Recitation styles (Hafs, Warsh, etc.)", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "quran_reciteraudio", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Surah-level audio files with completion status", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "quran_ayahaudio", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Ayah-level timing data for gapless playback", size: 22 })] })] })
          ]})
        ]
      }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("7.3 Lecture & Wiki Tables")] }),
      new Paragraph({
        spacing: { after: 100 },
        children: [new TextRun({ text: "The wiki subsystem manages structured lecture content with rich media support:", size: 24 })]
      }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "quran_wiki_lecturer: Lecturer profiles with personal info and media", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "quran_wiki_lecture: Lecture metadata with views, cover, keywords", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "quran_wiki_paragraph: Structured content with formatted text", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "quran_wiki_media: Media attachments with type classification", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "quran_wiki_album: Lecture groupings/collections", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "quran_wiki_tag: Content tagging system", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "quran_wiki_textlink: Cross-reference links between content", size: 24 })] }),
      
      // 8. Inferred Architecture
      new Paragraph({ heading: HeadingLevel.HEADING_1, children: [new TextRun("8. Inferred Architecture Blueprint")] }),
      new Paragraph({
        spacing: { after: 150 },
        children: [new TextRun({ text: "Based on the comprehensive analysis, the following architecture can be reconstructed for building a similar system with clean implementation:", size: 24 })]
      }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("8.1 Recommended Architecture Pattern")] }),
      new Paragraph({
        spacing: { after: 100 },
        children: [new TextRun({ text: "The application follows Clean Architecture with Feature-First organization:", size: 24 })]
      }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Presentation Layer: BLoC/Cubit for state management, Views/Widgets for UI, with reactive streams", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Domain Layer: Entities for business objects, Repository interfaces, UseCases for business logic", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Data Layer: Repository implementations, Data Sources (local/remote), Models with JSON serialization", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Core Layer: Shared utilities, API client, Database, Dependency injection setup", size: 24 })] }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("8.2 Key BLoC Components Identified")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "AuthBloc: User authentication state management", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "QuranAudioPlayerBloc: Audio playback state and controls", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "KhitmahsBloc: Quran completion program management", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "DailyAyahBloc: Daily verse scheduling and display", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "LectureDetailsBloc: Lecture content loading and navigation", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "QuranSearchBloc: Search query execution and results", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "DbUpdatesBloc: Database version checking and updates", size: 24 })] }),
      
      // 9. API Surface Inference
      new Paragraph({ heading: HeadingLevel.HEADING_1, children: [new TextRun("9. API Surface & Integration Model")] }),
      new Paragraph({
        spacing: { after: 150 },
        children: [new TextRun({ text: "Based on the analysis of API client code and network patterns, the following API surface is inferred:", size: 24 })]
      }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("9.1 Confirmed Endpoints")] }),
      new Table({
        columnWidths: [2000, 4000, 3360],
        margins: { top: 100, bottom: 100, left: 180, right: 180 },
        rows: [
          new TableRow({ tableHeader: true, children: [
            new TableCell({ borders: cellBorders, width: { size: 2000, type: WidthType.DXA }, shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Method", bold: true, size: 22 })] })] }),
            new TableCell({ borders: cellBorders, width: { size: 4000, type: WidthType.DXA }, shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Endpoint (Inferred)", bold: true, size: 22 })] })] }),
            new TableCell({ borders: cellBorders, width: { size: 3360, type: WidthType.DXA }, shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Purpose", bold: true, size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "POST", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "/auth/login", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "User authentication", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "POST", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "/auth/signup", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "User registration", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "GET", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "/db/check-versions", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Database version check", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "GET", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "/db/files/*", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Database file downloads", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "GET", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "/daily-ayah", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Daily verse content", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "GET", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "/reciters", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Reciter list", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "GET", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "/lectures", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Lecture listing", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "GET", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "/reading-programs", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Reading program list", size: 22 })] })] })
          ]})
        ]
      }),
      
      // 10. Confidence Levels & Uncertainties
      new Paragraph({ heading: HeadingLevel.HEADING_1, children: [new TextRun("10. Confidence Levels & Uncertainties")] }),
      new Paragraph({
        spacing: { after: 100 },
        children: [new TextRun({ text: "This section provides transparency about the reliability of findings and areas requiring further investigation:", size: 24 })]
      }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("10.1 High Confidence Findings (CONFIRMED)")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Flutter framework with Clean Architecture implementation", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "BLoC/Cubit state management pattern", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Drift ORM with SQLite database (40 tables confirmed)", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Audio service integration with background playback", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "API base URL: https://hudaallah.tabsera.ye/app_services/", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "37+ feature modules with complete package structure", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Bearer token authentication mechanism", size: 24 })] }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("10.2 Medium Confidence Findings (LIKELY)")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Specific API endpoint paths (inferred from code structure)", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "User registration flow includes name, email, password fields", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Database update mechanism with version checking", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Notification scheduling for daily ayah and reading programs", size: 24 })] }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("10.3 Low Confidence / Unknown Areas")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Server-side implementation details and business logic", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "User data synchronization strategy", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Content management workflow for lectures", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Payment or subscription mechanisms (if any)", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Analytics and crash reporting implementations", size: 24 })] }),
      
      // 11. Reconstruction Blueprint
      new Paragraph({ heading: HeadingLevel.HEADING_1, children: [new TextRun("11. Actionable Engineering Blueprint")] }),
      new Paragraph({
        spacing: { after: 150 },
        children: [new TextRun({ text: "This section provides a practical guide for building a similar system using clean, legitimate implementation approaches:", size: 24 })]
      }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("11.1 Recommended Technology Stack")] }),
      new Table({
        columnWidths: [2500, 6860],
        margins: { top: 100, bottom: 100, left: 180, right: 180 },
        rows: [
          new TableRow({ tableHeader: true, children: [
            new TableCell({ borders: cellBorders, width: { size: 2500, type: WidthType.DXA }, shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Layer", bold: true, size: 22 })] })] }),
            new TableCell({ borders: cellBorders, width: { size: 6860, type: WidthType.DXA }, shading: { fill: colors.tableBg, type: ShadingType.CLEAR }, children: [new Paragraph({ alignment: AlignmentType.CENTER, children: [new TextRun({ text: "Technology", bold: true, size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Framework", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Flutter 3.x with Dart 3.x, null safety enabled", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "State Management", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "flutter_bloc with freezed for immutable states", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "DI Container", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "get_it with injectable for compile-time injection", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Database", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Drift (Moor) with SQLite for offline-first architecture", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Network", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Dio with retrofit for type-safe API clients", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Audio", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "just_audio with audio_service for background playback", size: 22 })] })] })
          ]}),
          new TableRow({ children: [
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Backend", size: 22 })] })] }),
            new TableCell({ borders: cellBorders, children: [new Paragraph({ children: [new TextRun({ text: "Node.js/NestJS or Python/FastAPI with PostgreSQL", size: 22 })] })] })
          ]})
        ]
      }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_2, children: [new TextRun("11.2 Feature Implementation Priority")] }),
      new Paragraph({ heading: HeadingLevel.HEADING_3, children: [new TextRun("Phase 1: Core Infrastructure")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Project setup with clean architecture folder structure", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Database schema migration and initial data seeding", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "API client with authentication interceptor", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Dependency injection configuration", size: 24 })] }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_3, children: [new TextRun("Phase 2: Quran Features")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Page display with custom fonts (Uthmanic Hafs)", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Navigation by surah, juz, page, and ayah", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Search functionality with morphological support", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Bookmark and favorites system", size: 24 })] }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_3, children: [new TextRun("Phase 3: Audio Features")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Reciter selection and management", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Ayah-by-ayah audio playback", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Download manager for offline content", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Background playback with media controls", size: 24 })] }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_3, children: [new TextRun("Phase 4: Personal Features")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Khitmah (completion) program creation and tracking", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Daily ayah notifications", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Reading program subscriptions", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Progress tracking and reminders", size: 24 })] }),
      
      new Paragraph({ heading: HeadingLevel.HEADING_3, children: [new TextRun("Phase 5: Content Features")] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Lecture browsing and content display", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Media attachments (audio, video, documents)", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Lecturer profiles and content organization", size: 24 })] }),
      new Paragraph({ numbering: { reference: "bullet-list", level: 0 }, children: [new TextRun({ text: "Content download for offline access", size: 24 })] }),
      
      // Conclusion
      new Paragraph({ heading: HeadingLevel.HEADING_1, children: [new TextRun("12. Conclusion")] }),
      new Paragraph({
        spacing: { after: 150 },
        children: [new TextRun({ text: "This comprehensive reverse engineering analysis has revealed a well-architected Islamic content application built with modern Flutter development practices. The application demonstrates sophisticated features including Quran display with authentic typography, audio recitation with precise timing data, structured lecture content delivery, and personalized reading programs.", size: 24 })]
      }),
      new Paragraph({
        spacing: { after: 150 },
        children: [new TextRun({ text: "The technical implementation follows industry best practices with clean architecture separation, reactive state management, and offline-first data strategies. The database schema reveals a comprehensive content model designed for rich Islamic educational experiences.", size: 24 })]
      }),
      new Paragraph({
        spacing: { after: 150 },
        children: [new TextRun({ text: "This analysis provides a solid foundation for building similar systems using legitimate, clean implementation approaches while respecting intellectual property and avoiding direct code reproduction.", size: 24 })]
      }),
      
      // Document info
      new Paragraph({ spacing: { before: 400 }, children: [] }),
      new Paragraph({
        alignment: AlignmentType.CENTER,
        children: [new TextRun({ text: "Document generated for educational and research purposes", size: 20, color: colors.secondary, italics: true })]
      }),
      new Paragraph({
        alignment: AlignmentType.CENTER,
        children: [new TextRun({ text: "Analysis Date: March 22, 2026", size: 20, color: colors.secondary })]
      })
    ]
  }]
});

// Save the document
Packer.toBuffer(doc).then(buffer => {
  fs.writeFileSync("/home/z/my-project/download/Huda_Allah_Reverse_Analysis_Report.docx", buffer);
  console.log("Report generated successfully: /home/z/my-project/download/Huda_Allah_Reverse_Analysis_Report.docx");
}).catch(err => {
  console.error("Error generating document:", err);
});
