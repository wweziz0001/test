import { NestFactory } from '@nestjs/core';
import { ValidationPipe } from '@nestjs/common';
import { SwaggerModule, DocumentBuilder } from '@nestjs/swagger';
import { AppModule } from './app.module';

async function bootstrap() {
  const app = await NestFactory.create(AppModule);

  // Enable CORS
  app.enableCors({
    origin: ['http://localhost:3000', 'http://localhost:3001', 'http://localhost:8080'],
    methods: 'GET,HEAD,PUT,PATCH,POST,DELETE,OPTIONS',
    credentials: true,
  });

  // Global validation pipe
  app.useGlobalPipes(
    new ValidationPipe({
      whitelist: true,
      transform: true,
    }),
  );

  // Set global prefix
  app.setGlobalPrefix('api');

  // Swagger documentation
  const config = new DocumentBuilder()
    .setTitle('Huda Allah API')
    .setDescription('نظام هدى الله - واجهة برمجة التطبيقات')
    .setVersion('1.0')
    .addTag('quran', 'القرآن الكريم')
    .addTag('audio', 'الصوتيات')
    .addTag('wiki', 'المحاضرات والمحتوى')
    .addTag('reading', 'برامج القراءة')
    .build();

  const document = SwaggerModule.createDocument(app, config);
  SwaggerModule.setup('api/docs', app, document);

  const port = process.env.PORT || 3000;
  await app.listen(port);
  
  console.log(`
  ╔═══════════════════════════════════════════════════════════╗
  ║                   هدى الله - Backend API                   ║
  ╠═══════════════════════════════════════════════════════════╣
  ║  Server running on: http://localhost:${port}                 ║
  ║  API Documentation: http://localhost:${port}/api/docs        ║
  ╚═══════════════════════════════════════════════════════════╝
  `);
}
bootstrap();
