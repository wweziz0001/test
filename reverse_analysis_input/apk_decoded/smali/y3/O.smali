.class public final synthetic Ly3/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM3/l;


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Ly3/Q;

.field public final synthetic n:Landroid/webkit/JsResult;


# direct methods
.method public synthetic constructor <init>(Ly3/Q;Landroid/webkit/JsResult;I)V
    .locals 0

    .line 1
    iput p3, p0, Ly3/O;->l:I

    iput-object p1, p0, Ly3/O;->m:Ly3/Q;

    iput-object p2, p0, Ly3/O;->n:Landroid/webkit/JsResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ly3/O;->l:I

    .line 2
    .line 3
    check-cast p1, Ly3/J;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ly3/O;->m:Ly3/Q;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-boolean v1, p1, Ly3/J;->d:Z

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v0, v0, Ly3/Q;->b:Ly3/j;

    .line 18
    .line 19
    iget-object v0, v0, Ly3/j;->a:LA/e;

    .line 20
    .line 21
    iget-object p1, p1, Ly3/J;->c:Ljava/lang/Throwable;

    .line 22
    .line 23
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, LA/e;->k(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object p1, p1, Ly3/J;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Ljava/lang/String;

    .line 36
    .line 37
    iget-object v0, p0, Ly3/O;->n:Landroid/webkit/JsResult;

    .line 38
    .line 39
    check-cast v0, Landroid/webkit/JsPromptResult;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Landroid/webkit/JsPromptResult;->confirm(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v0}, Landroid/webkit/JsResult;->cancel()V

    .line 48
    .line 49
    .line 50
    :goto_0
    const/4 p1, 0x0

    .line 51
    return-object p1

    .line 52
    :pswitch_0
    iget-object v0, p0, Ly3/O;->m:Ly3/Q;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget-boolean v1, p1, Ly3/J;->d:Z

    .line 58
    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    iget-object v0, v0, Ly3/Q;->b:Ly3/j;

    .line 62
    .line 63
    iget-object v0, v0, Ly3/j;->a:LA/e;

    .line 64
    .line 65
    iget-object p1, p1, Ly3/J;->c:Ljava/lang/Throwable;

    .line 66
    .line 67
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {p1}, LA/e;->k(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    iget-object p1, p0, Ly3/O;->n:Landroid/webkit/JsResult;

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/webkit/JsResult;->confirm()V

    .line 80
    .line 81
    .line 82
    :goto_1
    const/4 p1, 0x0

    .line 83
    return-object p1

    .line 84
    :pswitch_1
    iget-object v0, p0, Ly3/O;->m:Ly3/Q;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget-boolean v1, p1, Ly3/J;->d:Z

    .line 90
    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    iget-object v0, v0, Ly3/Q;->b:Ly3/j;

    .line 94
    .line 95
    iget-object v0, v0, Ly3/j;->a:LA/e;

    .line 96
    .line 97
    iget-object p1, p1, Ly3/J;->c:Ljava/lang/Throwable;

    .line 98
    .line 99
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-static {p1}, LA/e;->k(Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_3
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 110
    .line 111
    iget-object p1, p1, Ly3/J;->b:Ljava/lang/Object;

    .line 112
    .line 113
    invoke-virtual {v0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    iget-object v0, p0, Ly3/O;->n:Landroid/webkit/JsResult;

    .line 118
    .line 119
    if-eqz p1, :cond_4

    .line 120
    .line 121
    invoke-virtual {v0}, Landroid/webkit/JsResult;->confirm()V

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_4
    invoke-virtual {v0}, Landroid/webkit/JsResult;->cancel()V

    .line 126
    .line 127
    .line 128
    :goto_2
    const/4 p1, 0x0

    .line 129
    return-object p1

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
