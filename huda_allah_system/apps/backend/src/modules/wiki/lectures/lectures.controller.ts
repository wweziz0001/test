import { Controller, Get, Param, Query, Post } from '@nestjs/common';
import { ApiTags, ApiOperation } from '@nestjs/swagger';
import { LecturesService } from './lectures.service';

@ApiTags('wiki - المحاضرات والمحتوى')
@Controller('wiki')
export class LecturesController {
  constructor(private readonly lecturesService: LecturesService) {}

  // Lectures
  @Get('lectures')
  @ApiOperation({ summary: 'جميع المحاضرات' })
  findAllLectures(@Query('page') page = 1, @Query('limit') limit = 20) {
    return this.lecturesService.findAll(+page, +limit);
  }

  @Get('lectures/search')
  @ApiOperation({ summary: 'البحث في المحاضرات' })
  searchLectures(@Query('q') query: string) {
    return this.lecturesService.search(query);
  }

  @Get('lectures/lecturer/:lecturerId')
  @ApiOperation({ summary: 'محاضرات محاضر معين' })
  findByLecturer(@Param('lecturerId') lecturerId: string) {
    return this.lecturesService.findByLecturer(+lecturerId);
  }

  @Get('lectures/album/:albumId')
  @ApiOperation({ summary: 'محاضرات ألبوم معين' })
  findByAlbum(@Param('albumId') albumId: string) {
    return this.lecturesService.findByAlbum(+albumId);
  }

  @Get('lectures/:id')
  @ApiOperation({ summary: 'محاضرة بالمعرف' })
  findLecture(@Param('id') id: string) {
    return this.lecturesService.findOne(+id);
  }

  @Get('lectures/:id/paragraphs')
  @ApiOperation({ summary: 'فقرات المحاضرة' })
  getParagraphs(@Param('id') id: string) {
    return this.lecturesService.getParagraphs(+id);
  }

  @Get('lectures/:id/media')
  @ApiOperation({ summary: 'وسائط المحاضرة' })
  getMedia(@Param('id') id: string) {
    return this.lecturesService.getMedia(+id);
  }

  @Post('lectures/:id/view')
  @ApiOperation({ summary: 'زيادة المشاهدات' })
  incrementViews(@Param('id') id: string) {
    return this.lecturesService.incrementViews(+id);
  }

  // Albums
  @Get('albums')
  @ApiOperation({ summary: 'جميع الألبومات' })
  findAllAlbums() {
    return this.lecturesService.findAllAlbums();
  }

  @Get('albums/:id')
  @ApiOperation({ summary: 'ألبوم بالمعرف' })
  findAlbum(@Param('id') id: string) {
    return this.lecturesService.findAlbum(+id);
  }

  // Tags
  @Get('tags')
  @ApiOperation({ summary: 'جميع الوسوم' })
  findAllTags() {
    return this.lecturesService.findAllTags();
  }

  @Get('tags/:id/lectures')
  @ApiOperation({ summary: 'محاضرات وسم معين' })
  findLecturesByTag(@Param('id') id: string) {
    return this.lecturesService.findLecturesByTag(+id);
  }

  // Groups
  @Get('groups')
  @ApiOperation({ summary: 'مجموعات المحاضرات' })
  findAllGroups() {
    return this.lecturesService.findAllGroups();
  }
}
