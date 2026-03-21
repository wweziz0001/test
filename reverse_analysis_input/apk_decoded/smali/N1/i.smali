.class public final LN1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic l:I

.field public final m:Ljava/lang/Object;

.field public final n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LN1/j;Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LN1/i;->l:I

    const-string v0, "sidecarCompat"

    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LN1/i;->m:Ljava/lang/Object;

    .line 5
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LN1/i;->n:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Lio/flutter/plugin/platform/l;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LN1/i;->l:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN1/i;->m:Ljava/lang/Object;

    iput-object p2, p0, LN1/i;->n:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/A;Landroidx/fragment/app/T;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LN1/i;->l:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN1/i;->n:Ljava/lang/Object;

    iput-object p2, p0, LN1/i;->m:Ljava/lang/Object;

    return-void
.end method

.method private final a(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private final b(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    iget v0, p0, LN1/i;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lio/flutter/plugin/platform/y;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, p0, v0}, Lio/flutter/plugin/platform/y;-><init>(Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lio/flutter/plugin/platform/z;

    .line 13
    .line 14
    iget-object v1, p0, LN1/i;->m:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Landroid/view/View;

    .line 17
    .line 18
    invoke-direct {v0, v1, p1}, Lio/flutter/plugin/platform/z;-><init>(Landroid/view/View;Lio/flutter/plugin/platform/y;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_0
    iget-object p1, p0, LN1/i;->m:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Landroidx/fragment/app/T;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroidx/fragment/app/T;->k()V

    .line 37
    .line 38
    .line 39
    iget-object p1, p1, Landroidx/fragment/app/T;->c:Landroidx/fragment/app/r;

    .line 40
    .line 41
    iget-object p1, p1, Landroidx/fragment/app/r;->Q:Lio/flutter/embedding/android/D;

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Landroid/view/ViewGroup;

    .line 48
    .line 49
    iget-object v0, p0, LN1/i;->n:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Landroidx/fragment/app/A;

    .line 52
    .line 53
    iget-object v0, v0, Landroidx/fragment/app/A;->l:Landroidx/fragment/app/L;

    .line 54
    .line 55
    invoke-static {p1, v0}, Landroidx/fragment/app/m;->j(Landroid/view/ViewGroup;Landroidx/fragment/app/L;)Landroidx/fragment/app/m;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Landroidx/fragment/app/m;->i()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_1
    const-string v0, "view"

    .line 64
    .line 65
    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, LN1/i;->n:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Landroid/app/Activity;

    .line 80
    .line 81
    if-eqz p1, :cond_0

    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    if-eqz v0, :cond_0

    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-eqz v0, :cond_0

    .line 94
    .line 95
    iget-object v0, v0, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_0
    const/4 v0, 0x0

    .line 99
    :goto_0
    if-nez p1, :cond_1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    if-nez v0, :cond_2

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    iget-object v1, p0, LN1/i;->m:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v1, LN1/j;

    .line 108
    .line 109
    invoke-virtual {v1, v0, p1}, LN1/j;->g(Landroid/os/IBinder;Landroid/app/Activity;)V

    .line 110
    .line 111
    .line 112
    :goto_1
    return-void

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    iget v0, p0, LN1/i;->l:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    return-void

    :pswitch_1
    const-string v0, "view"

    invoke-static {p1, v0}, LN3/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
