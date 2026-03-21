import { Controller, Get, Param } from '@nestjs/common';
import { ApiTags, ApiOperation } from '@nestjs/swagger';
import { LecturersService } from './lecturers.service';

@ApiTags('wiki - المحاضرات والمحتوى')
@Controller('wiki/lecturers')
export class LecturersController {
  constructor(private readonly lecturersService: LecturersService) {}

  @Get()
  @ApiOperation({ summary: 'جميع المحاضرين' })
  findAll() {
    return this.lecturersService.findAll();
  }

  @Get('types')
  @ApiOperation({ summary: 'أنواع المحاضرين' })
  findAllTypes() {
    return this.lecturersService.findAllTypes();
  }

  @Get('type/:typeId')
  @ApiOperation({ summary: 'محاضرون حسب النوع' })
  findByType(@Param('typeId') typeId: string) {
    return this.lecturersService.findByType(+typeId);
  }

  @Get(':id')
  @ApiOperation({ summary: 'محاضر بالمعرف' })
  findOne(@Param('id') id: string) {
    return this.lecturersService.findOne(+id);
  }
}
