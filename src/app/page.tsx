'use client'

import { useState, useEffect } from 'react'
import { Card, CardContent, CardDescription, CardHeader, CardTitle } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Badge } from '@/components/ui/badge'
import { Tabs, TabsContent, TabsList, TabsTrigger } from '@/components/ui/tabs'
import { 
  Book, Headphones, Mic, Users, BookOpen, Music, 
  FileText, Tag, Layers, Calendar, Settings, Search,
  TrendingUp, Eye, Download, Play
} from 'lucide-react'

// Dashboard Statistics
const stats = [
  { title: 'السور', value: '114', icon: Book, color: 'text-green-600', bg: 'bg-green-100' },
  { title: 'الآيات', value: '6,348', icon: FileText, color: 'text-blue-600', bg: 'bg-blue-100' },
  { title: 'القراء', value: '3', icon: Mic, color: 'text-purple-600', bg: 'bg-purple-100' },
  { title: 'المحاضرات', value: '681', icon: Users, color: 'text-orange-600', bg: 'bg-orange-100' },
  { title: 'المحاضرين', value: '8', icon: Headphones, color: 'text-pink-600', bg: 'bg-pink-100' },
  { title: 'الفقرات', value: '36,668', icon: Layers, color: 'text-teal-600', bg: 'bg-teal-100' },
  { title: 'الوسائط', value: '658', icon: Music, color: 'text-indigo-600', bg: 'bg-indigo-100' },
  { title: 'الوسوم', value: '4,036', icon: Tag, color: 'text-amber-600', bg: 'bg-amber-100' },
]

// Navigation Items
const navItems = [
  { title: 'لوحة التحكم', icon: TrendingUp, active: true },
  { title: 'القرآن الكريم', icon: Book },
  { title: 'الصوتيات', icon: Headphones },
  { title: 'المحاضرات', icon: Mic },
  { title: 'المحاضرين', icon: Users },
  { title: 'الوسائط', icon: Music },
  { title: 'برامج القراءة', icon: Calendar },
  { title: 'الإعدادات', icon: Settings },
]

export default function AdminDashboard() {
  const [mounted, setMounted] = useState(false)

  useEffect(() => {
    setMounted(true)
  }, [])

  if (!mounted) {
    return <div className="min-h-screen bg-gray-50 flex items-center justify-center">
      <div className="text-lg">جاري التحميل...</div>
    </div>
  }

  return (
    <div className="min-h-screen bg-gray-50" dir="rtl">
      {/* Header */}
      <header className="bg-white border-b sticky top-0 z-50">
        <div className="container mx-auto px-4 h-16 flex items-center justify-between">
          <div className="flex items-center gap-4">
            <div className="w-10 h-10 bg-green-600 rounded-lg flex items-center justify-center">
              <Book className="w-6 h-6 text-white" />
            </div>
            <div>
              <h1 className="text-xl font-bold text-gray-900">هدى الله</h1>
              <p className="text-xs text-gray-500">لوحة التحكم</p>
            </div>
          </div>
          
          <div className="flex items-center gap-4">
            <div className="relative">
              <Search className="absolute right-3 top-1/2 -translate-y-1/2 w-4 h-4 text-gray-400" />
              <input 
                type="text" 
                placeholder="بحث..." 
                className="pr-10 pl-4 py-2 border rounded-lg text-sm focus:outline-none focus:ring-2 focus:ring-green-500 w-64"
              />
            </div>
            <Button variant="ghost" size="icon">
              <Settings className="w-5 h-5" />
            </Button>
          </div>
        </div>
      </header>

      <div className="flex">
        {/* Sidebar */}
        <aside className="w-64 bg-white border-l min-h-[calc(100vh-4rem)] p-4 hidden md:block">
          <nav className="space-y-2">
            {navItems.map((item, index) => (
              <button
                key={index}
                className={`w-full flex items-center gap-3 px-4 py-3 rounded-lg text-right transition-colors ${
                  item.active 
                    ? 'bg-green-50 text-green-700 font-medium' 
                    : 'text-gray-600 hover:bg-gray-50'
                }`}
              >
                <item.icon className="w-5 h-5" />
                <span>{item.title}</span>
              </button>
            ))}
          </nav>
        </aside>

        {/* Main Content */}
        <main className="flex-1 p-6">
          {/* Stats Grid */}
          <div className="grid grid-cols-2 md:grid-cols-4 gap-4 mb-8">
            {stats.map((stat, index) => (
              <Card key={index} className="hover:shadow-md transition-shadow">
                <CardContent className="p-4">
                  <div className="flex items-center justify-between">
                    <div>
                      <p className="text-sm text-gray-500 mb-1">{stat.title}</p>
                      <p className="text-2xl font-bold">{stat.value}</p>
                    </div>
                    <div className={`w-12 h-12 rounded-lg ${stat.bg} flex items-center justify-center`}>
                      <stat.icon className={`w-6 h-6 ${stat.color}`} />
                    </div>
                  </div>
                </CardContent>
              </Card>
            ))}
          </div>

          {/* Tabs */}
          <Tabs defaultValue="quran" className="space-y-6">
            <TabsList className="bg-white border rounded-lg p-1">
              <TabsTrigger value="quran" className="data-[state=active]:bg-green-50 data-[state=active]:text-green-700">
                القرآن الكريم
              </TabsTrigger>
              <TabsTrigger value="audio" className="data-[state=active]:bg-green-50 data-[state=active]:text-green-700">
                الصوتيات
              </TabsTrigger>
              <TabsTrigger value="lectures" className="data-[state=active]:bg-green-50 data-[state=active]:text-green-700">
                المحاضرات
              </TabsTrigger>
              <TabsTrigger value="media" className="data-[state=active]:bg-green-50 data-[state=active]:text-green-700">
                الوسائط
              </TabsTrigger>
            </TabsList>

            <TabsContent value="quran" className="space-y-4">
              <Card>
                <CardHeader>
                  <CardTitle className="flex items-center gap-2">
                    <Book className="w-5 h-5 text-green-600" />
                    سور القرآن الكريم
                  </CardTitle>
                  <CardDescription>عرض وإدارة سور القرآن الكريم الـ 114</CardDescription>
                </CardHeader>
                <CardContent>
                  <div className="grid grid-cols-2 md:grid-cols-4 lg:grid-cols-6 gap-3">
                    {[1,2,3,4,5,6,7,8,9,10,11,12].map((num) => (
                      <button key={num} className="p-3 border rounded-lg hover:bg-green-50 hover:border-green-200 transition-colors text-center">
                        <div className="text-lg font-bold text-green-700 mb-1">{num}</div>
                        <div className="text-xs text-gray-500">الفاتحة</div>
                        <Badge variant="secondary" className="text-xs mt-1">مكية</Badge>
                      </button>
                    ))}
                  </div>
                  <div className="mt-4 text-center">
                    <Button variant="outline">عرض جميع السور</Button>
                  </div>
                </CardContent>
              </Card>

              <div className="grid md:grid-cols-2 gap-4">
                <Card>
                  <CardHeader>
                    <CardTitle className="text-lg">الأجزاء</CardTitle>
                    <CardDescription>30 جزء</CardDescription>
                  </CardHeader>
                  <CardContent>
                    <div className="grid grid-cols-6 gap-2">
                      {Array.from({length: 30}, (_, i) => i + 1).map((num) => (
                        <button key={num} className="aspect-square border rounded-lg hover:bg-blue-50 flex items-center justify-center font-medium">
                          {num}
                        </button>
                      ))}
                    </div>
                  </CardContent>
                </Card>

                <Card>
                  <CardHeader>
                    <CardTitle className="text-lg">الأحزاب</CardTitle>
                    <CardDescription>60 حزب (240 ربع)</CardDescription>
                  </CardHeader>
                  <CardContent>
                    <div className="space-y-2">
                      <div className="flex justify-between text-sm">
                        <span>الحزب 1</span>
                        <span className="text-gray-500">الصفحة 1-10</span>
                      </div>
                      <div className="flex justify-between text-sm">
                        <span>الحزب 2</span>
                        <span className="text-gray-500">الصفحة 11-20</span>
                      </div>
                      <div className="flex justify-between text-sm">
                        <span>الحزب 3</span>
                        <span className="text-gray-500">الصفحة 21-30</span>
                      </div>
                    </div>
                  </CardContent>
                </Card>
              </div>
            </TabsContent>

            <TabsContent value="audio" className="space-y-4">
              <Card>
                <CardHeader>
                  <CardTitle className="flex items-center gap-2">
                    <Headphones className="w-5 h-5 text-purple-600" />
                    القراء والتلاوات
                  </CardTitle>
                  <CardDescription>إدارة القراء وملفات التلاوات الصوتية</CardDescription>
                </CardHeader>
                <CardContent>
                  <div className="space-y-4">
                    {[
                      { name: 'محمد صديق المنشاوي', type: 'تجويد', files: 114 },
                      { name: 'عبد الباسط عبد الصمد', type: 'ترتيل', files: 114 },
                      { name: 'محمود خليل الحُصَري', type: 'تعليمي', files: 114 },
                    ].map((reciter, index) => (
                      <div key={index} className="flex items-center justify-between p-4 border rounded-lg hover:bg-gray-50">
                        <div className="flex items-center gap-4">
                          <div className="w-12 h-12 bg-purple-100 rounded-full flex items-center justify-center">
                            <Mic className="w-6 h-6 text-purple-600" />
                          </div>
                          <div>
                            <h4 className="font-medium">{reciter.name}</h4>
                            <p className="text-sm text-gray-500">{reciter.type}</p>
                          </div>
                        </div>
                        <div className="flex items-center gap-4">
                          <Badge variant="secondary">{reciter.files} سورة</Badge>
                          <Button size="sm" variant="outline">
                            <Play className="w-4 h-4 ml-1" />
                            استماع
                          </Button>
                        </div>
                      </div>
                    ))}
                  </div>
                </CardContent>
              </Card>
            </TabsContent>

            <TabsContent value="lectures" className="space-y-4">
              <Card>
                <CardHeader>
                  <CardTitle className="flex items-center gap-2">
                    <Mic className="w-5 h-5 text-orange-600" />
                    المحاضرات الأخيرة
                  </CardTitle>
                  <CardDescription>681 محاضرة من 8 محاضرين</CardDescription>
                </CardHeader>
                <CardContent>
                  <div className="space-y-3">
                    {[
                      { title: 'تفسير سورة الفاتحة', lecturer: 'فقيه القرآن', views: 1250, date: '2024-01-15' },
                      { title: 'سورة يوسف', lecturer: 'السيد القائد', views: 980, date: '2024-01-14' },
                      { title: 'سورة البقرة', lecturer: 'فقيه القرآن', views: 850, date: '2024-01-13' },
                      { title: 'آل عمران', lecturer: 'فقيه القرآن', views: 720, date: '2024-01-12' },
                    ].map((lecture, index) => (
                      <div key={index} className="flex items-center justify-between p-3 border rounded-lg hover:bg-gray-50">
                        <div className="flex items-center gap-3">
                          <div className="w-10 h-10 bg-orange-100 rounded-lg flex items-center justify-center">
                            <FileText className="w-5 h-5 text-orange-600" />
                          </div>
                          <div>
                            <h4 className="font-medium text-sm">{lecture.title}</h4>
                            <p className="text-xs text-gray-500">{lecture.lecturer}</p>
                          </div>
                        </div>
                        <div className="flex items-center gap-4 text-sm text-gray-500">
                          <span className="flex items-center gap-1">
                            <Eye className="w-4 h-4" />
                            {lecture.views}
                          </span>
                          <span>{lecture.date}</span>
                        </div>
                      </div>
                    ))}
                  </div>
                </CardContent>
              </Card>

              <div className="grid md:grid-cols-3 gap-4">
                <Card>
                  <CardHeader className="pb-2">
                    <CardTitle className="text-lg">المحاضرين</CardTitle>
                  </CardHeader>
                  <CardContent>
                    <div className="text-3xl font-bold text-orange-600">8</div>
                    <p className="text-sm text-gray-500">محاضر نشط</p>
                  </CardContent>
                </Card>
                <Card>
                  <CardHeader className="pb-2">
                    <CardTitle className="text-lg">الألبومات</CardTitle>
                  </CardHeader>
                  <CardContent>
                    <div className="text-3xl font-bold text-purple-600">40</div>
                    <p className="text-sm text-gray-500">ألبوم</p>
                  </CardContent>
                </Card>
                <Card>
                  <CardHeader className="pb-2">
                    <CardTitle className="text-lg">الفقرات</CardTitle>
                  </CardHeader>
                  <CardContent>
                    <div className="text-3xl font-bold text-blue-600">36,668</div>
                    <p className="text-sm text-gray-500">فقرة</p>
                  </CardContent>
                </Card>
              </div>
            </TabsContent>

            <TabsContent value="media" className="space-y-4">
              <Card>
                <CardHeader>
                  <CardTitle className="flex items-center gap-2">
                    <Music className="w-5 h-5 text-indigo-600" />
                    الوسائط
                  </CardTitle>
                  <CardDescription>إدارة الملفات الصوتية والمرئية والصور</CardDescription>
                </CardHeader>
                <CardContent>
                  <div className="grid grid-cols-2 md:grid-cols-4 gap-4">
                    {[
                      { type: 'صوت', count: 523, icon: Headphones, color: 'bg-green-100 text-green-600' },
                      { type: 'صور', count: 85, icon: FileText, color: 'bg-blue-100 text-blue-600' },
                      { type: 'فيديو', count: 42, icon: Play, color: 'bg-purple-100 text-purple-600' },
                      { type: 'PDF', count: 8, icon: Download, color: 'bg-red-100 text-red-600' },
                    ].map((media, index) => (
                      <div key={index} className="p-4 border rounded-lg text-center hover:shadow-md transition-shadow">
                        <div className={`w-12 h-12 rounded-lg ${media.color} flex items-center justify-center mx-auto mb-2`}>
                          <media.icon className="w-6 h-6" />
                        </div>
                        <div className="font-bold text-lg">{media.count}</div>
                        <div className="text-sm text-gray-500">{media.type}</div>
                      </div>
                    ))}
                  </div>
                </CardContent>
              </Card>
            </TabsContent>
          </Tabs>
        </main>
      </div>
    </div>
  )
}
