.class public final Lio/flutter/view/k;
.super Landroid/view/accessibility/AccessibilityNodeProvider;
.source "SourceFile"


# static fields
.field public static final synthetic y:I


# instance fields
.field public final a:Landroid/view/View;

.field public final b:LZ1/m;

.field public final c:Landroid/view/accessibility/AccessibilityManager;

.field public final d:Lio/flutter/view/AccessibilityViewEmbedder;

.field public final e:LZ1/l;

.field public final f:Landroid/content/ContentResolver;

.field public final g:Ljava/util/HashMap;

.field public final h:Ljava/util/HashMap;

.field public i:Lio/flutter/view/g;

.field public j:Ljava/lang/Integer;

.field public k:Ljava/lang/Integer;

.field public l:I

.field public m:Lio/flutter/view/g;

.field public n:Lio/flutter/view/g;

.field public o:Lio/flutter/view/g;

.field public final p:Ljava/util/ArrayList;

.field public q:I

.field public r:Landroidx/lifecycle/E;

.field public s:Z

.field public t:Z

.field public final u:Lio/flutter/view/a;

.field public final v:Lio/flutter/view/b;

.field public final w:Lio/flutter/view/c;

.field public final x:LJ/a;


# direct methods
.method public constructor <init>(Landroid/view/View;LZ1/m;Landroid/view/accessibility/AccessibilityManager;Landroid/content/ContentResolver;LZ1/l;)V
    .locals 6

    .line 1
    new-instance v0, Lio/flutter/view/AccessibilityViewEmbedder;

    .line 2
    .line 3
    const/high16 v1, 0x10000

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Lio/flutter/view/AccessibilityViewEmbedder;-><init>(Landroid/view/View;I)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Landroid/view/accessibility/AccessibilityNodeProvider;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lio/flutter/view/k;->g:Ljava/util/HashMap;

    .line 17
    .line 18
    new-instance v1, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lio/flutter/view/k;->h:Ljava/util/HashMap;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    iput v1, p0, Lio/flutter/view/k;->l:I

    .line 27
    .line 28
    new-instance v2, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v2, p0, Lio/flutter/view/k;->p:Ljava/util/ArrayList;

    .line 34
    .line 35
    iput v1, p0, Lio/flutter/view/k;->q:I

    .line 36
    .line 37
    iput-boolean v1, p0, Lio/flutter/view/k;->s:Z

    .line 38
    .line 39
    iput-boolean v1, p0, Lio/flutter/view/k;->t:Z

    .line 40
    .line 41
    new-instance v2, Lio/flutter/view/a;

    .line 42
    .line 43
    invoke-direct {v2, p0}, Lio/flutter/view/a;-><init>(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iput-object v2, p0, Lio/flutter/view/k;->u:Lio/flutter/view/a;

    .line 47
    .line 48
    new-instance v2, Lio/flutter/view/b;

    .line 49
    .line 50
    invoke-direct {v2, p0}, Lio/flutter/view/b;-><init>(Lio/flutter/view/k;)V

    .line 51
    .line 52
    .line 53
    iput-object v2, p0, Lio/flutter/view/k;->v:Lio/flutter/view/b;

    .line 54
    .line 55
    new-instance v3, LJ/a;

    .line 56
    .line 57
    new-instance v4, Landroid/os/Handler;

    .line 58
    .line 59
    invoke-direct {v4}, Landroid/os/Handler;-><init>()V

    .line 60
    .line 61
    .line 62
    const/4 v5, 0x2

    .line 63
    invoke-direct {v3, p0, v4, v5}, LJ/a;-><init>(Ljava/lang/Object;Landroid/os/Handler;I)V

    .line 64
    .line 65
    .line 66
    iput-object v3, p0, Lio/flutter/view/k;->x:LJ/a;

    .line 67
    .line 68
    iput-object p1, p0, Lio/flutter/view/k;->a:Landroid/view/View;

    .line 69
    .line 70
    iput-object p2, p0, Lio/flutter/view/k;->b:LZ1/m;

    .line 71
    .line 72
    iput-object p3, p0, Lio/flutter/view/k;->c:Landroid/view/accessibility/AccessibilityManager;

    .line 73
    .line 74
    iput-object p4, p0, Lio/flutter/view/k;->f:Landroid/content/ContentResolver;

    .line 75
    .line 76
    iput-object v0, p0, Lio/flutter/view/k;->d:Lio/flutter/view/AccessibilityViewEmbedder;

    .line 77
    .line 78
    iput-object p5, p0, Lio/flutter/view/k;->e:LZ1/l;

    .line 79
    .line 80
    invoke-virtual {p3}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    invoke-virtual {v2, v0}, Lio/flutter/view/b;->onAccessibilityStateChanged(Z)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p3, v2}, Landroid/view/accessibility/AccessibilityManager;->addAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    .line 88
    .line 89
    .line 90
    new-instance v0, Lio/flutter/view/c;

    .line 91
    .line 92
    invoke-direct {v0, p0, p3}, Lio/flutter/view/c;-><init>(Lio/flutter/view/k;Landroid/view/accessibility/AccessibilityManager;)V

    .line 93
    .line 94
    .line 95
    iput-object v0, p0, Lio/flutter/view/k;->w:Lio/flutter/view/c;

    .line 96
    .line 97
    invoke-virtual {p3}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    invoke-virtual {v0, v2}, Lio/flutter/view/c;->onTouchExplorationStateChanged(Z)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p3, v0}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 105
    .line 106
    .line 107
    iget p3, p0, Lio/flutter/view/k;->l:I

    .line 108
    .line 109
    or-int/lit16 p3, p3, 0x80

    .line 110
    .line 111
    iput p3, p0, Lio/flutter/view/k;->l:I

    .line 112
    .line 113
    const/4 p3, 0x0

    .line 114
    invoke-virtual {v3, v1, p3}, LJ/a;->onChange(ZLandroid/net/Uri;)V

    .line 115
    .line 116
    .line 117
    const-string p3, "transition_animation_scale"

    .line 118
    .line 119
    invoke-static {p3}, Landroid/provider/Settings$Global;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    .line 120
    .line 121
    .line 122
    move-result-object p3

    .line 123
    invoke-virtual {p4, p3, v1, v3}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 124
    .line 125
    .line 126
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 127
    .line 128
    const/16 p4, 0x1f

    .line 129
    .line 130
    if-lt p3, p4, :cond_2

    .line 131
    .line 132
    if-eqz p1, :cond_2

    .line 133
    .line 134
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 135
    .line 136
    .line 137
    move-result-object p3

    .line 138
    if-nez p3, :cond_0

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-static {p1}, Li0/g;->a(Landroid/content/res/Configuration;)I

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    const p3, 0x7fffffff

    .line 154
    .line 155
    .line 156
    if-eq p1, p3, :cond_1

    .line 157
    .line 158
    const/16 p3, 0x12c

    .line 159
    .line 160
    if-lt p1, p3, :cond_1

    .line 161
    .line 162
    iget p1, p0, Lio/flutter/view/k;->l:I

    .line 163
    .line 164
    or-int/lit8 p1, p1, 0x8

    .line 165
    .line 166
    iput p1, p0, Lio/flutter/view/k;->l:I

    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_1
    iget p1, p0, Lio/flutter/view/k;->l:I

    .line 170
    .line 171
    and-int/lit8 p1, p1, -0x9

    .line 172
    .line 173
    iput p1, p0, Lio/flutter/view/k;->l:I

    .line 174
    .line 175
    :goto_0
    iget p1, p0, Lio/flutter/view/k;->l:I

    .line 176
    .line 177
    iget-object p2, p2, LZ1/m;->n:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast p2, Lio/flutter/embedding/engine/FlutterJNI;

    .line 180
    .line 181
    invoke-virtual {p2, p1}, Lio/flutter/embedding/engine/FlutterJNI;->setAccessibilityFeatures(I)V

    .line 182
    .line 183
    .line 184
    :cond_2
    :goto_1
    iget-object p1, p5, LZ1/l;->l:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast p1, Lio/flutter/plugin/platform/p;

    .line 187
    .line 188
    iget-object p1, p1, Lio/flutter/plugin/platform/p;->i:Lio/flutter/plugin/platform/a;

    .line 189
    .line 190
    iput-object p0, p1, Lio/flutter/plugin/platform/a;->a:Lio/flutter/view/k;

    .line 191
    .line 192
    iget-object p1, p5, LZ1/l;->m:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast p1, Lio/flutter/plugin/platform/o;

    .line 195
    .line 196
    iget-object p1, p1, Lio/flutter/plugin/platform/o;->h:Lio/flutter/plugin/platform/a;

    .line 197
    .line 198
    iput-object p0, p1, Lio/flutter/plugin/platform/a;->a:Lio/flutter/view/k;

    .line 199
    .line 200
    return-void
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
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
.end method


# virtual methods
.method public final a(Landroid/view/View;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/view/k;->d:Lio/flutter/view/AccessibilityViewEmbedder;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lio/flutter/view/AccessibilityViewEmbedder;->requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-virtual {v0, p1, p3}, Lio/flutter/view/AccessibilityViewEmbedder;->getRecordFlutterId(Landroid/view/View;Landroid/view/accessibility/AccessibilityRecord;)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    invoke-virtual {p3}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    const/16 p3, 0x8

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    if-eq p2, p3, :cond_5

    .line 26
    .line 27
    const/16 p3, 0x80

    .line 28
    .line 29
    if-eq p2, p3, :cond_4

    .line 30
    .line 31
    const p3, 0x8000

    .line 32
    .line 33
    .line 34
    if-eq p2, p3, :cond_3

    .line 35
    .line 36
    const/high16 p1, 0x10000

    .line 37
    .line 38
    if-eq p2, p1, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    iput-object v0, p0, Lio/flutter/view/k;->k:Ljava/lang/Integer;

    .line 42
    .line 43
    iput-object v0, p0, Lio/flutter/view/k;->j:Ljava/lang/Integer;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    iput-object p1, p0, Lio/flutter/view/k;->j:Ljava/lang/Integer;

    .line 47
    .line 48
    iput-object v0, p0, Lio/flutter/view/k;->i:Lio/flutter/view/g;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_4
    iput-object v0, p0, Lio/flutter/view/k;->o:Lio/flutter/view/g;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_5
    iput-object p1, p0, Lio/flutter/view/k;->k:Ljava/lang/Integer;

    .line 55
    .line 56
    iput-object v0, p0, Lio/flutter/view/k;->m:Lio/flutter/view/g;

    .line 57
    .line 58
    :goto_0
    const/4 p1, 0x1

    .line 59
    return p1
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
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
.end method

.method public final b(I)Lio/flutter/view/e;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/flutter/view/k;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lio/flutter/view/e;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    new-instance v1, Lio/flutter/view/e;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v2, -0x1

    .line 21
    iput v2, v1, Lio/flutter/view/e;->c:I

    .line 22
    .line 23
    iput p1, v1, Lio/flutter/view/e;->b:I

    .line 24
    .line 25
    const v2, 0xff00001

    .line 26
    .line 27
    .line 28
    add-int/2addr v2, p1

    .line 29
    iput v2, v1, Lio/flutter/view/e;->a:I

    .line 30
    .line 31
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    :cond_0
    return-object v1
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

.method public final c(I)Lio/flutter/view/g;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/view/k;->g:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lio/flutter/view/g;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    new-instance v1, Lio/flutter/view/g;

    .line 16
    .line 17
    invoke-direct {v1, p0}, Lio/flutter/view/g;-><init>(Lio/flutter/view/k;)V

    .line 18
    .line 19
    .line 20
    iput p1, v1, Lio/flutter/view/g;->b:I

    .line 21
    .line 22
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_0
    return-object v1
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

.method public final createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x2

    .line 7
    const/4 v5, 0x1

    .line 8
    invoke-virtual {v0, v5}, Lio/flutter/view/k;->i(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v6, v0, Lio/flutter/view/k;->d:Lio/flutter/view/AccessibilityViewEmbedder;

    .line 12
    .line 13
    const/high16 v7, 0x10000

    .line 14
    .line 15
    if-lt v1, v7, :cond_0

    .line 16
    .line 17
    invoke-virtual {v6, v1}, Lio/flutter/view/AccessibilityViewEmbedder;->createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    return-object v1

    .line 22
    :cond_0
    iget-object v8, v0, Lio/flutter/view/k;->g:Ljava/util/HashMap;

    .line 23
    .line 24
    const/4 v9, -0x1

    .line 25
    iget-object v10, v0, Lio/flutter/view/k;->a:Landroid/view/View;

    .line 26
    .line 27
    if-ne v1, v9, :cond_2

    .line 28
    .line 29
    invoke-static {v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v10, v1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v8, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    invoke-virtual {v1, v10, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;I)V

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-virtual {v1, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setImportantForAccessibility(Z)V

    .line 50
    .line 51
    .line 52
    return-object v1

    .line 53
    :cond_2
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v11

    .line 57
    invoke-virtual {v8, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    check-cast v8, Lio/flutter/view/g;

    .line 62
    .line 63
    const/4 v11, 0x0

    .line 64
    if-nez v8, :cond_3

    .line 65
    .line 66
    return-object v11

    .line 67
    :cond_3
    iget v12, v8, Lio/flutter/view/g;->i:I

    .line 68
    .line 69
    iget-object v13, v0, Lio/flutter/view/k;->e:LZ1/l;

    .line 70
    .line 71
    if-eq v12, v9, :cond_5

    .line 72
    .line 73
    invoke-virtual {v13, v12}, LZ1/l;->g0(I)Z

    .line 74
    .line 75
    .line 76
    move-result v12

    .line 77
    if-eqz v12, :cond_5

    .line 78
    .line 79
    iget v1, v8, Lio/flutter/view/g;->i:I

    .line 80
    .line 81
    invoke-virtual {v13, v1}, LZ1/l;->S(I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-nez v1, :cond_4

    .line 86
    .line 87
    return-object v11

    .line 88
    :cond_4
    iget-object v2, v8, Lio/flutter/view/g;->Z:Landroid/graphics/Rect;

    .line 89
    .line 90
    iget v3, v8, Lio/flutter/view/g;->b:I

    .line 91
    .line 92
    invoke-virtual {v6, v1, v3, v2}, Lio/flutter/view/AccessibilityViewEmbedder;->getRootNode(Landroid/view/View;ILandroid/graphics/Rect;)Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    return-object v1

    .line 97
    :cond_5
    invoke-static {v10, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/View;I)Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 102
    .line 103
    const/16 v14, 0xc

    .line 104
    .line 105
    invoke-virtual {v8, v14}, Lio/flutter/view/g;->i(I)Z

    .line 106
    .line 107
    .line 108
    move-result v15

    .line 109
    if-eqz v15, :cond_7

    .line 110
    .line 111
    :cond_6
    move v15, v3

    .line 112
    goto :goto_1

    .line 113
    :cond_7
    invoke-static {v8}, Lio/flutter/view/g;->b(Lio/flutter/view/g;)Ljava/lang/CharSequence;

    .line 114
    .line 115
    .line 116
    move-result-object v15

    .line 117
    if-eqz v15, :cond_8

    .line 118
    .line 119
    :goto_0
    move v15, v5

    .line 120
    goto :goto_1

    .line 121
    :cond_8
    iget v15, v8, Lio/flutter/view/g;->d:I

    .line 122
    .line 123
    if-eqz v15, :cond_6

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :goto_1
    invoke-virtual {v6, v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->setImportantForAccessibility(Z)V

    .line 127
    .line 128
    .line 129
    const-string v15, ""

    .line 130
    .line 131
    invoke-virtual {v6, v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->setViewIdResourceName(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    iget-object v11, v8, Lio/flutter/view/g;->o:Ljava/lang/String;

    .line 135
    .line 136
    if-eqz v11, :cond_9

    .line 137
    .line 138
    invoke-virtual {v6, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->setViewIdResourceName(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    :cond_9
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 142
    .line 143
    .line 144
    move-result-object v11

    .line 145
    invoke-virtual {v11}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v11

    .line 149
    invoke-virtual {v6, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPackageName(Ljava/lang/CharSequence;)V

    .line 150
    .line 151
    .line 152
    const-string v11, "android.view.View"

    .line 153
    .line 154
    invoke-virtual {v6, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6, v10, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSource(Landroid/view/View;I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v8}, Lio/flutter/view/g;->k()Z

    .line 161
    .line 162
    .line 163
    move-result v11

    .line 164
    invoke-virtual {v6, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocusable(Z)V

    .line 165
    .line 166
    .line 167
    iget-object v11, v0, Lio/flutter/view/k;->m:Lio/flutter/view/g;

    .line 168
    .line 169
    if-eqz v11, :cond_b

    .line 170
    .line 171
    iget v11, v11, Lio/flutter/view/g;->b:I

    .line 172
    .line 173
    if-ne v11, v1, :cond_a

    .line 174
    .line 175
    move v11, v5

    .line 176
    goto :goto_2

    .line 177
    :cond_a
    move v11, v3

    .line 178
    :goto_2
    invoke-virtual {v6, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocused(Z)V

    .line 179
    .line 180
    .line 181
    :cond_b
    iget-object v11, v0, Lio/flutter/view/k;->i:Lio/flutter/view/g;

    .line 182
    .line 183
    if-eqz v11, :cond_d

    .line 184
    .line 185
    iget v11, v11, Lio/flutter/view/g;->b:I

    .line 186
    .line 187
    if-ne v11, v1, :cond_c

    .line 188
    .line 189
    move v11, v5

    .line 190
    goto :goto_3

    .line 191
    :cond_c
    move v11, v3

    .line 192
    :goto_3
    invoke-virtual {v6, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 193
    .line 194
    .line 195
    :cond_d
    const/4 v11, 0x5

    .line 196
    invoke-virtual {v8, v11}, Lio/flutter/view/g;->i(I)Z

    .line 197
    .line 198
    .line 199
    move-result v16

    .line 200
    if-eqz v16, :cond_16

    .line 201
    .line 202
    const/16 v14, 0xb

    .line 203
    .line 204
    invoke-virtual {v8, v14}, Lio/flutter/view/g;->i(I)Z

    .line 205
    .line 206
    .line 207
    move-result v14

    .line 208
    invoke-virtual {v6, v14}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPassword(Z)V

    .line 209
    .line 210
    .line 211
    const/16 v14, 0x15

    .line 212
    .line 213
    invoke-virtual {v8, v14}, Lio/flutter/view/g;->i(I)Z

    .line 214
    .line 215
    .line 216
    move-result v17

    .line 217
    if-nez v17, :cond_e

    .line 218
    .line 219
    const-string v2, "android.widget.EditText"

    .line 220
    .line 221
    invoke-virtual {v6, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 222
    .line 223
    .line 224
    :cond_e
    invoke-virtual {v8, v14}, Lio/flutter/view/g;->i(I)Z

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    xor-int/2addr v2, v5

    .line 229
    invoke-virtual {v6, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEditable(Z)V

    .line 230
    .line 231
    .line 232
    iget v2, v8, Lio/flutter/view/g;->g:I

    .line 233
    .line 234
    if-eq v2, v9, :cond_f

    .line 235
    .line 236
    iget v14, v8, Lio/flutter/view/g;->h:I

    .line 237
    .line 238
    if-eq v14, v9, :cond_f

    .line 239
    .line 240
    invoke-virtual {v6, v2, v14}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTextSelection(II)V

    .line 241
    .line 242
    .line 243
    :cond_f
    iget-object v2, v0, Lio/flutter/view/k;->i:Lio/flutter/view/g;

    .line 244
    .line 245
    if-eqz v2, :cond_10

    .line 246
    .line 247
    iget v2, v2, Lio/flutter/view/g;->b:I

    .line 248
    .line 249
    if-ne v2, v1, :cond_10

    .line 250
    .line 251
    invoke-virtual {v6, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLiveRegion(I)V

    .line 252
    .line 253
    .line 254
    :cond_10
    sget-object v2, Lio/flutter/view/d;->v:Lio/flutter/view/d;

    .line 255
    .line 256
    invoke-static {v8, v2}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    const/16 v14, 0x100

    .line 261
    .line 262
    if-eqz v2, :cond_11

    .line 263
    .line 264
    invoke-virtual {v6, v14}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 265
    .line 266
    .line 267
    move v2, v5

    .line 268
    goto :goto_4

    .line 269
    :cond_11
    move v2, v3

    .line 270
    :goto_4
    sget-object v11, Lio/flutter/view/d;->w:Lio/flutter/view/d;

    .line 271
    .line 272
    invoke-static {v8, v11}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 273
    .line 274
    .line 275
    move-result v11

    .line 276
    const/16 v3, 0x200

    .line 277
    .line 278
    if-eqz v11, :cond_12

    .line 279
    .line 280
    invoke-virtual {v6, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 281
    .line 282
    .line 283
    move v2, v5

    .line 284
    :cond_12
    sget-object v11, Lio/flutter/view/d;->F:Lio/flutter/view/d;

    .line 285
    .line 286
    invoke-static {v8, v11}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 287
    .line 288
    .line 289
    move-result v11

    .line 290
    if-eqz v11, :cond_13

    .line 291
    .line 292
    invoke-virtual {v6, v14}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 293
    .line 294
    .line 295
    or-int/2addr v2, v4

    .line 296
    :cond_13
    sget-object v11, Lio/flutter/view/d;->G:Lio/flutter/view/d;

    .line 297
    .line 298
    invoke-static {v8, v11}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 299
    .line 300
    .line 301
    move-result v11

    .line 302
    if-eqz v11, :cond_14

    .line 303
    .line 304
    invoke-virtual {v6, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 305
    .line 306
    .line 307
    or-int/2addr v2, v4

    .line 308
    :cond_14
    invoke-virtual {v6, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMovementGranularities(I)V

    .line 309
    .line 310
    .line 311
    iget v2, v8, Lio/flutter/view/g;->e:I

    .line 312
    .line 313
    if-ltz v2, :cond_16

    .line 314
    .line 315
    iget-object v2, v8, Lio/flutter/view/g;->r:Ljava/lang/String;

    .line 316
    .line 317
    if-nez v2, :cond_15

    .line 318
    .line 319
    const/4 v2, 0x0

    .line 320
    goto :goto_5

    .line 321
    :cond_15
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 322
    .line 323
    .line 324
    move-result v2

    .line 325
    :goto_5
    iget v3, v8, Lio/flutter/view/g;->f:I

    .line 326
    .line 327
    iget v11, v8, Lio/flutter/view/g;->e:I

    .line 328
    .line 329
    sub-int/2addr v2, v3

    .line 330
    add-int/2addr v2, v11

    .line 331
    invoke-virtual {v6, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMaxTextLength(I)V

    .line 332
    .line 333
    .line 334
    :cond_16
    sget-object v2, Lio/flutter/view/d;->x:Lio/flutter/view/d;

    .line 335
    .line 336
    invoke-static {v8, v2}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 337
    .line 338
    .line 339
    move-result v2

    .line 340
    if-eqz v2, :cond_17

    .line 341
    .line 342
    const/high16 v2, 0x20000

    .line 343
    .line 344
    invoke-virtual {v6, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 345
    .line 346
    .line 347
    :cond_17
    sget-object v2, Lio/flutter/view/d;->y:Lio/flutter/view/d;

    .line 348
    .line 349
    invoke-static {v8, v2}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 350
    .line 351
    .line 352
    move-result v2

    .line 353
    if-eqz v2, :cond_18

    .line 354
    .line 355
    const/16 v2, 0x4000

    .line 356
    .line 357
    invoke-virtual {v6, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 358
    .line 359
    .line 360
    :cond_18
    sget-object v2, Lio/flutter/view/d;->z:Lio/flutter/view/d;

    .line 361
    .line 362
    invoke-static {v8, v2}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    if-eqz v2, :cond_19

    .line 367
    .line 368
    invoke-virtual {v6, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 369
    .line 370
    .line 371
    :cond_19
    sget-object v2, Lio/flutter/view/d;->A:Lio/flutter/view/d;

    .line 372
    .line 373
    invoke-static {v8, v2}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 374
    .line 375
    .line 376
    move-result v2

    .line 377
    if-eqz v2, :cond_1a

    .line 378
    .line 379
    const v2, 0x8000

    .line 380
    .line 381
    .line 382
    invoke-virtual {v6, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 383
    .line 384
    .line 385
    :cond_1a
    sget-object v2, Lio/flutter/view/d;->H:Lio/flutter/view/d;

    .line 386
    .line 387
    invoke-static {v8, v2}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 388
    .line 389
    .line 390
    move-result v2

    .line 391
    if-eqz v2, :cond_1b

    .line 392
    .line 393
    const/high16 v2, 0x200000

    .line 394
    .line 395
    invoke-virtual {v6, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 396
    .line 397
    .line 398
    :cond_1b
    const/4 v2, 0x4

    .line 399
    invoke-virtual {v8, v2}, Lio/flutter/view/g;->i(I)Z

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    if-eqz v2, :cond_1c

    .line 404
    .line 405
    const-string v2, "android.widget.Button"

    .line 406
    .line 407
    invoke-virtual {v6, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 408
    .line 409
    .line 410
    :cond_1c
    const/16 v2, 0xf

    .line 411
    .line 412
    invoke-virtual {v8, v2}, Lio/flutter/view/g;->i(I)Z

    .line 413
    .line 414
    .line 415
    move-result v2

    .line 416
    if-eqz v2, :cond_1d

    .line 417
    .line 418
    const-string v2, "android.widget.ImageView"

    .line 419
    .line 420
    invoke-virtual {v6, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 421
    .line 422
    .line 423
    :cond_1d
    sget-object v2, Lio/flutter/view/d;->E:Lio/flutter/view/d;

    .line 424
    .line 425
    invoke-static {v8, v2}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    if-eqz v2, :cond_1e

    .line 430
    .line 431
    invoke-virtual {v6, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setDismissable(Z)V

    .line 432
    .line 433
    .line 434
    const/high16 v2, 0x100000

    .line 435
    .line 436
    invoke-virtual {v6, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 437
    .line 438
    .line 439
    :cond_1e
    iget-object v2, v8, Lio/flutter/view/g;->P:Lio/flutter/view/g;

    .line 440
    .line 441
    if-eqz v2, :cond_1f

    .line 442
    .line 443
    iget v2, v2, Lio/flutter/view/g;->b:I

    .line 444
    .line 445
    invoke-virtual {v6, v10, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;I)V

    .line 446
    .line 447
    .line 448
    goto :goto_6

    .line 449
    :cond_1f
    invoke-virtual {v6, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;)V

    .line 450
    .line 451
    .line 452
    :goto_6
    iget v2, v8, Lio/flutter/view/g;->B:I

    .line 453
    .line 454
    if-eq v2, v9, :cond_20

    .line 455
    .line 456
    invoke-virtual {v6, v10, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalAfter(Landroid/view/View;I)V

    .line 457
    .line 458
    .line 459
    :cond_20
    iget-object v2, v8, Lio/flutter/view/g;->Z:Landroid/graphics/Rect;

    .line 460
    .line 461
    iget-object v3, v8, Lio/flutter/view/g;->P:Lio/flutter/view/g;

    .line 462
    .line 463
    if-eqz v3, :cond_21

    .line 464
    .line 465
    iget-object v3, v3, Lio/flutter/view/g;->Z:Landroid/graphics/Rect;

    .line 466
    .line 467
    new-instance v7, Landroid/graphics/Rect;

    .line 468
    .line 469
    invoke-direct {v7, v2}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 470
    .line 471
    .line 472
    iget v11, v3, Landroid/graphics/Rect;->left:I

    .line 473
    .line 474
    neg-int v11, v11

    .line 475
    iget v3, v3, Landroid/graphics/Rect;->top:I

    .line 476
    .line 477
    neg-int v3, v3

    .line 478
    invoke-virtual {v7, v11, v3}, Landroid/graphics/Rect;->offset(II)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v6, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInParent(Landroid/graphics/Rect;)V

    .line 482
    .line 483
    .line 484
    goto :goto_7

    .line 485
    :cond_21
    invoke-virtual {v6, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInParent(Landroid/graphics/Rect;)V

    .line 486
    .line 487
    .line 488
    :goto_7
    new-instance v3, Landroid/graphics/Rect;

    .line 489
    .line 490
    invoke-direct {v3, v2}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 491
    .line 492
    .line 493
    new-array v2, v4, [I

    .line 494
    .line 495
    invoke-virtual {v10, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 496
    .line 497
    .line 498
    const/4 v7, 0x0

    .line 499
    aget v11, v2, v7

    .line 500
    .line 501
    aget v2, v2, v5

    .line 502
    .line 503
    invoke-virtual {v3, v11, v2}, Landroid/graphics/Rect;->offset(II)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v6, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v6, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    .line 510
    .line 511
    .line 512
    const/4 v2, 0x7

    .line 513
    invoke-virtual {v8, v2}, Lio/flutter/view/g;->i(I)Z

    .line 514
    .line 515
    .line 516
    move-result v2

    .line 517
    if-eqz v2, :cond_23

    .line 518
    .line 519
    const/16 v2, 0x8

    .line 520
    .line 521
    invoke-virtual {v8, v2}, Lio/flutter/view/g;->i(I)Z

    .line 522
    .line 523
    .line 524
    move-result v2

    .line 525
    if-eqz v2, :cond_22

    .line 526
    .line 527
    goto :goto_8

    .line 528
    :cond_22
    const/4 v2, 0x0

    .line 529
    goto :goto_9

    .line 530
    :cond_23
    :goto_8
    move v2, v5

    .line 531
    :goto_9
    invoke-virtual {v6, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V

    .line 532
    .line 533
    .line 534
    sget-object v2, Lio/flutter/view/d;->m:Lio/flutter/view/d;

    .line 535
    .line 536
    invoke-static {v8, v2}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 537
    .line 538
    .line 539
    move-result v2

    .line 540
    const/16 v3, 0x10

    .line 541
    .line 542
    if-eqz v2, :cond_25

    .line 543
    .line 544
    iget-object v2, v8, Lio/flutter/view/g;->T:Lio/flutter/view/e;

    .line 545
    .line 546
    if-eqz v2, :cond_24

    .line 547
    .line 548
    new-instance v2, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 549
    .line 550
    iget-object v7, v8, Lio/flutter/view/g;->T:Lio/flutter/view/e;

    .line 551
    .line 552
    iget-object v7, v7, Lio/flutter/view/e;->e:Ljava/lang/String;

    .line 553
    .line 554
    invoke-direct {v2, v3, v7}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;-><init>(ILjava/lang/CharSequence;)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v6, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v6, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 561
    .line 562
    .line 563
    goto :goto_a

    .line 564
    :cond_24
    invoke-virtual {v6, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 565
    .line 566
    .line 567
    invoke-virtual {v6, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 568
    .line 569
    .line 570
    goto :goto_a

    .line 571
    :cond_25
    const/16 v2, 0x18

    .line 572
    .line 573
    invoke-virtual {v8, v2}, Lio/flutter/view/g;->i(I)Z

    .line 574
    .line 575
    .line 576
    move-result v2

    .line 577
    if-eqz v2, :cond_26

    .line 578
    .line 579
    invoke-virtual {v6, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v6, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 583
    .line 584
    .line 585
    :cond_26
    :goto_a
    sget-object v2, Lio/flutter/view/d;->n:Lio/flutter/view/d;

    .line 586
    .line 587
    invoke-static {v8, v2}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 588
    .line 589
    .line 590
    move-result v2

    .line 591
    if-eqz v2, :cond_28

    .line 592
    .line 593
    iget-object v2, v8, Lio/flutter/view/g;->U:Lio/flutter/view/e;

    .line 594
    .line 595
    const/16 v7, 0x20

    .line 596
    .line 597
    if-eqz v2, :cond_27

    .line 598
    .line 599
    new-instance v2, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 600
    .line 601
    iget-object v11, v8, Lio/flutter/view/g;->U:Lio/flutter/view/e;

    .line 602
    .line 603
    iget-object v11, v11, Lio/flutter/view/e;->e:Ljava/lang/String;

    .line 604
    .line 605
    invoke-direct {v2, v7, v11}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;-><init>(ILjava/lang/CharSequence;)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v6, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v6, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V

    .line 612
    .line 613
    .line 614
    goto :goto_b

    .line 615
    :cond_27
    invoke-virtual {v6, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v6, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V

    .line 619
    .line 620
    .line 621
    :cond_28
    :goto_b
    sget-object v2, Lio/flutter/view/d;->o:Lio/flutter/view/d;

    .line 622
    .line 623
    invoke-static {v8, v2}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 624
    .line 625
    .line 626
    move-result v7

    .line 627
    sget-object v11, Lio/flutter/view/d;->r:Lio/flutter/view/d;

    .line 628
    .line 629
    sget-object v14, Lio/flutter/view/d;->q:Lio/flutter/view/d;

    .line 630
    .line 631
    sget-object v9, Lio/flutter/view/d;->p:Lio/flutter/view/d;

    .line 632
    .line 633
    const/16 v4, 0x2000

    .line 634
    .line 635
    const/16 v3, 0x1000

    .line 636
    .line 637
    if-nez v7, :cond_29

    .line 638
    .line 639
    invoke-static {v8, v14}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 640
    .line 641
    .line 642
    move-result v7

    .line 643
    if-nez v7, :cond_29

    .line 644
    .line 645
    invoke-static {v8, v9}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 646
    .line 647
    .line 648
    move-result v7

    .line 649
    if-nez v7, :cond_29

    .line 650
    .line 651
    invoke-static {v8, v11}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 652
    .line 653
    .line 654
    move-result v7

    .line 655
    if-eqz v7, :cond_32

    .line 656
    .line 657
    :cond_29
    invoke-virtual {v6, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    .line 658
    .line 659
    .line 660
    const/16 v7, 0x13

    .line 661
    .line 662
    invoke-virtual {v8, v7}, Lio/flutter/view/g;->i(I)Z

    .line 663
    .line 664
    .line 665
    move-result v7

    .line 666
    if-eqz v7, :cond_2e

    .line 667
    .line 668
    invoke-static {v8, v2}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 669
    .line 670
    .line 671
    move-result v7

    .line 672
    if-nez v7, :cond_2a

    .line 673
    .line 674
    invoke-static {v8, v9}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 675
    .line 676
    .line 677
    move-result v7

    .line 678
    if-eqz v7, :cond_2b

    .line 679
    .line 680
    :cond_2a
    const/4 v5, 0x0

    .line 681
    goto :goto_c

    .line 682
    :cond_2b
    invoke-virtual {v0, v8}, Lio/flutter/view/k;->j(Lio/flutter/view/g;)Z

    .line 683
    .line 684
    .line 685
    move-result v7

    .line 686
    if-eqz v7, :cond_2c

    .line 687
    .line 688
    iget v7, v8, Lio/flutter/view/g;->j:I

    .line 689
    .line 690
    const/4 v5, 0x0

    .line 691
    invoke-static {v7, v5, v5}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    .line 692
    .line 693
    .line 694
    move-result-object v7

    .line 695
    invoke-virtual {v6, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    .line 696
    .line 697
    .line 698
    goto :goto_d

    .line 699
    :cond_2c
    const/4 v5, 0x0

    .line 700
    const-string v7, "android.widget.ScrollView"

    .line 701
    .line 702
    invoke-virtual {v6, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 703
    .line 704
    .line 705
    goto :goto_d

    .line 706
    :goto_c
    invoke-virtual {v0, v8}, Lio/flutter/view/k;->j(Lio/flutter/view/g;)Z

    .line 707
    .line 708
    .line 709
    move-result v7

    .line 710
    if-eqz v7, :cond_2d

    .line 711
    .line 712
    iget v7, v8, Lio/flutter/view/g;->j:I

    .line 713
    .line 714
    invoke-static {v5, v7, v5}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    .line 715
    .line 716
    .line 717
    move-result-object v7

    .line 718
    invoke-virtual {v6, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    .line 719
    .line 720
    .line 721
    goto :goto_d

    .line 722
    :cond_2d
    const-string v5, "android.widget.HorizontalScrollView"

    .line 723
    .line 724
    invoke-virtual {v6, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 725
    .line 726
    .line 727
    :cond_2e
    :goto_d
    invoke-static {v8, v2}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 728
    .line 729
    .line 730
    move-result v2

    .line 731
    if-nez v2, :cond_2f

    .line 732
    .line 733
    invoke-static {v8, v14}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 734
    .line 735
    .line 736
    move-result v2

    .line 737
    if-eqz v2, :cond_30

    .line 738
    .line 739
    :cond_2f
    invoke-virtual {v6, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 740
    .line 741
    .line 742
    :cond_30
    invoke-static {v8, v9}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 743
    .line 744
    .line 745
    move-result v2

    .line 746
    if-nez v2, :cond_31

    .line 747
    .line 748
    invoke-static {v8, v11}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 749
    .line 750
    .line 751
    move-result v2

    .line 752
    if-eqz v2, :cond_32

    .line 753
    .line 754
    :cond_31
    invoke-virtual {v6, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 755
    .line 756
    .line 757
    :cond_32
    sget-object v2, Lio/flutter/view/d;->s:Lio/flutter/view/d;

    .line 758
    .line 759
    invoke-static {v8, v2}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 760
    .line 761
    .line 762
    move-result v5

    .line 763
    sget-object v7, Lio/flutter/view/d;->t:Lio/flutter/view/d;

    .line 764
    .line 765
    if-nez v5, :cond_34

    .line 766
    .line 767
    invoke-static {v8, v7}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 768
    .line 769
    .line 770
    move-result v5

    .line 771
    if-eqz v5, :cond_33

    .line 772
    .line 773
    goto :goto_f

    .line 774
    :cond_33
    :goto_e
    const/16 v2, 0x10

    .line 775
    .line 776
    goto :goto_10

    .line 777
    :cond_34
    :goto_f
    const-string v5, "android.widget.SeekBar"

    .line 778
    .line 779
    invoke-virtual {v6, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 780
    .line 781
    .line 782
    invoke-static {v8, v2}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 783
    .line 784
    .line 785
    move-result v2

    .line 786
    if-eqz v2, :cond_35

    .line 787
    .line 788
    invoke-virtual {v6, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 789
    .line 790
    .line 791
    :cond_35
    invoke-static {v8, v7}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 792
    .line 793
    .line 794
    move-result v2

    .line 795
    if-eqz v2, :cond_33

    .line 796
    .line 797
    invoke-virtual {v6, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 798
    .line 799
    .line 800
    goto :goto_e

    .line 801
    :goto_10
    invoke-virtual {v8, v2}, Lio/flutter/view/g;->i(I)Z

    .line 802
    .line 803
    .line 804
    move-result v2

    .line 805
    if-eqz v2, :cond_36

    .line 806
    .line 807
    const/4 v2, 0x1

    .line 808
    invoke-virtual {v6, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLiveRegion(I)V

    .line 809
    .line 810
    .line 811
    :cond_36
    const/4 v2, 0x5

    .line 812
    invoke-virtual {v8, v2}, Lio/flutter/view/g;->i(I)Z

    .line 813
    .line 814
    .line 815
    move-result v2

    .line 816
    const/16 v3, 0x1c

    .line 817
    .line 818
    if-eqz v2, :cond_3b

    .line 819
    .line 820
    iget-object v2, v8, Lio/flutter/view/g;->r:Ljava/lang/String;

    .line 821
    .line 822
    iget-object v4, v8, Lio/flutter/view/g;->s:Ljava/util/ArrayList;

    .line 823
    .line 824
    invoke-static {v2, v4}, Lio/flutter/view/g;->e(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/text/SpannableString;

    .line 825
    .line 826
    .line 827
    move-result-object v2

    .line 828
    invoke-virtual {v6, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V

    .line 829
    .line 830
    .line 831
    if-lt v12, v3, :cond_3e

    .line 832
    .line 833
    invoke-virtual {v8}, Lio/flutter/view/g;->f()Landroid/text/SpannableString;

    .line 834
    .line 835
    .line 836
    move-result-object v2

    .line 837
    iget-object v4, v8, Lio/flutter/view/g;->x:Ljava/lang/String;

    .line 838
    .line 839
    iget-object v5, v8, Lio/flutter/view/g;->y:Ljava/util/ArrayList;

    .line 840
    .line 841
    invoke-static {v4, v5}, Lio/flutter/view/g;->e(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/text/SpannableString;

    .line 842
    .line 843
    .line 844
    move-result-object v4

    .line 845
    const/4 v5, 0x2

    .line 846
    new-array v7, v5, [Ljava/lang/CharSequence;

    .line 847
    .line 848
    const/4 v9, 0x0

    .line 849
    aput-object v2, v7, v9

    .line 850
    .line 851
    const/4 v2, 0x1

    .line 852
    aput-object v4, v7, v2

    .line 853
    .line 854
    const/4 v2, 0x0

    .line 855
    const/4 v11, 0x0

    .line 856
    :goto_11
    if-ge v2, v5, :cond_3a

    .line 857
    .line 858
    aget-object v4, v7, v2

    .line 859
    .line 860
    if-eqz v4, :cond_39

    .line 861
    .line 862
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 863
    .line 864
    .line 865
    move-result v5

    .line 866
    if-lez v5, :cond_39

    .line 867
    .line 868
    if-eqz v11, :cond_37

    .line 869
    .line 870
    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    .line 871
    .line 872
    .line 873
    move-result v5

    .line 874
    if-nez v5, :cond_38

    .line 875
    .line 876
    :cond_37
    const/4 v12, 0x1

    .line 877
    goto :goto_12

    .line 878
    :cond_38
    const/4 v5, 0x3

    .line 879
    new-array v9, v5, [Ljava/lang/CharSequence;

    .line 880
    .line 881
    const/4 v5, 0x0

    .line 882
    aput-object v11, v9, v5

    .line 883
    .line 884
    const-string v5, ", "

    .line 885
    .line 886
    const/4 v12, 0x1

    .line 887
    aput-object v5, v9, v12

    .line 888
    .line 889
    const/4 v5, 0x2

    .line 890
    aput-object v4, v9, v5

    .line 891
    .line 892
    invoke-static {v9}, Landroid/text/TextUtils;->concat([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 893
    .line 894
    .line 895
    move-result-object v4

    .line 896
    :goto_12
    move-object v11, v4

    .line 897
    goto :goto_13

    .line 898
    :cond_39
    const/4 v12, 0x1

    .line 899
    :goto_13
    add-int/2addr v2, v12

    .line 900
    const/4 v5, 0x2

    .line 901
    goto :goto_11

    .line 902
    :cond_3a
    invoke-static {v6, v11}, Lio/flutter/embedding/android/B;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 903
    .line 904
    .line 905
    goto :goto_14

    .line 906
    :cond_3b
    const/16 v2, 0xc

    .line 907
    .line 908
    invoke-virtual {v8, v2}, Lio/flutter/view/g;->i(I)Z

    .line 909
    .line 910
    .line 911
    move-result v2

    .line 912
    if-nez v2, :cond_3e

    .line 913
    .line 914
    invoke-static {v8}, Lio/flutter/view/g;->b(Lio/flutter/view/g;)Ljava/lang/CharSequence;

    .line 915
    .line 916
    .line 917
    move-result-object v2

    .line 918
    if-ge v12, v3, :cond_3d

    .line 919
    .line 920
    iget-object v4, v8, Lio/flutter/view/g;->z:Ljava/lang/String;

    .line 921
    .line 922
    if-eqz v4, :cond_3d

    .line 923
    .line 924
    if-eqz v2, :cond_3c

    .line 925
    .line 926
    move-object v15, v2

    .line 927
    :cond_3c
    new-instance v2, Ljava/lang/StringBuilder;

    .line 928
    .line 929
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 930
    .line 931
    .line 932
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 933
    .line 934
    .line 935
    const-string v4, "\n"

    .line 936
    .line 937
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 938
    .line 939
    .line 940
    iget-object v4, v8, Lio/flutter/view/g;->z:Ljava/lang/String;

    .line 941
    .line 942
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 943
    .line 944
    .line 945
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object v2

    .line 949
    :cond_3d
    if-eqz v2, :cond_3e

    .line 950
    .line 951
    invoke-virtual {v6, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 952
    .line 953
    .line 954
    :cond_3e
    :goto_14
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 955
    .line 956
    if-lt v2, v3, :cond_3f

    .line 957
    .line 958
    iget-object v4, v8, Lio/flutter/view/g;->z:Ljava/lang/String;

    .line 959
    .line 960
    if-eqz v4, :cond_3f

    .line 961
    .line 962
    invoke-static {v6, v4}, Landroidx/media/C;->p(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V

    .line 963
    .line 964
    .line 965
    invoke-static {v8}, Lio/flutter/view/g;->b(Lio/flutter/view/g;)Ljava/lang/CharSequence;

    .line 966
    .line 967
    .line 968
    move-result-object v4

    .line 969
    if-nez v4, :cond_3f

    .line 970
    .line 971
    iget-object v4, v8, Lio/flutter/view/g;->z:Ljava/lang/String;

    .line 972
    .line 973
    invoke-virtual {v6, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 974
    .line 975
    .line 976
    :cond_3f
    const/4 v4, 0x1

    .line 977
    invoke-virtual {v8, v4}, Lio/flutter/view/g;->i(I)Z

    .line 978
    .line 979
    .line 980
    move-result v5

    .line 981
    const/16 v7, 0x11

    .line 982
    .line 983
    invoke-virtual {v8, v7}, Lio/flutter/view/g;->i(I)Z

    .line 984
    .line 985
    .line 986
    move-result v7

    .line 987
    if-nez v5, :cond_41

    .line 988
    .line 989
    if-eqz v7, :cond_40

    .line 990
    .line 991
    goto :goto_15

    .line 992
    :cond_40
    const/4 v4, 0x0

    .line 993
    :cond_41
    :goto_15
    invoke-virtual {v6, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 994
    .line 995
    .line 996
    if-eqz v5, :cond_44

    .line 997
    .line 998
    const/4 v4, 0x2

    .line 999
    invoke-virtual {v8, v4}, Lio/flutter/view/g;->i(I)Z

    .line 1000
    .line 1001
    .line 1002
    move-result v4

    .line 1003
    invoke-virtual {v6, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 1004
    .line 1005
    .line 1006
    const/16 v4, 0x9

    .line 1007
    .line 1008
    invoke-virtual {v8, v4}, Lio/flutter/view/g;->i(I)Z

    .line 1009
    .line 1010
    .line 1011
    move-result v4

    .line 1012
    if-eqz v4, :cond_43

    .line 1013
    .line 1014
    const-string v4, "android.widget.RadioButton"

    .line 1015
    .line 1016
    invoke-virtual {v6, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 1017
    .line 1018
    .line 1019
    :cond_42
    :goto_16
    const/4 v4, 0x3

    .line 1020
    goto :goto_17

    .line 1021
    :cond_43
    const-string v4, "android.widget.CheckBox"

    .line 1022
    .line 1023
    invoke-virtual {v6, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 1024
    .line 1025
    .line 1026
    goto :goto_16

    .line 1027
    :cond_44
    if-eqz v7, :cond_42

    .line 1028
    .line 1029
    const/16 v4, 0x12

    .line 1030
    .line 1031
    invoke-virtual {v8, v4}, Lio/flutter/view/g;->i(I)Z

    .line 1032
    .line 1033
    .line 1034
    move-result v4

    .line 1035
    invoke-virtual {v6, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 1036
    .line 1037
    .line 1038
    const-string v4, "android.widget.Switch"

    .line 1039
    .line 1040
    invoke-virtual {v6, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 1041
    .line 1042
    .line 1043
    goto :goto_16

    .line 1044
    :goto_17
    invoke-virtual {v8, v4}, Lio/flutter/view/g;->i(I)Z

    .line 1045
    .line 1046
    .line 1047
    move-result v4

    .line 1048
    invoke-virtual {v6, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSelected(Z)V

    .line 1049
    .line 1050
    .line 1051
    if-lt v2, v3, :cond_45

    .line 1052
    .line 1053
    const/16 v2, 0xa

    .line 1054
    .line 1055
    invoke-virtual {v8, v2}, Lio/flutter/view/g;->i(I)Z

    .line 1056
    .line 1057
    .line 1058
    move-result v2

    .line 1059
    invoke-static {v6, v2}, LB/b;->z(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 1060
    .line 1061
    .line 1062
    :cond_45
    iget-object v2, v0, Lio/flutter/view/k;->i:Lio/flutter/view/g;

    .line 1063
    .line 1064
    if-eqz v2, :cond_46

    .line 1065
    .line 1066
    iget v2, v2, Lio/flutter/view/g;->b:I

    .line 1067
    .line 1068
    if-ne v2, v1, :cond_46

    .line 1069
    .line 1070
    const/16 v1, 0x80

    .line 1071
    .line 1072
    invoke-virtual {v6, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 1073
    .line 1074
    .line 1075
    goto :goto_18

    .line 1076
    :cond_46
    const/16 v1, 0x40

    .line 1077
    .line 1078
    invoke-virtual {v6, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    .line 1079
    .line 1080
    .line 1081
    :goto_18
    iget-object v1, v8, Lio/flutter/view/g;->S:Ljava/util/ArrayList;

    .line 1082
    .line 1083
    if-eqz v1, :cond_47

    .line 1084
    .line 1085
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v1

    .line 1089
    :goto_19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1090
    .line 1091
    .line 1092
    move-result v2

    .line 1093
    if-eqz v2, :cond_47

    .line 1094
    .line 1095
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v2

    .line 1099
    check-cast v2, Lio/flutter/view/e;

    .line 1100
    .line 1101
    new-instance v3, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 1102
    .line 1103
    iget v4, v2, Lio/flutter/view/e;->a:I

    .line 1104
    .line 1105
    iget-object v2, v2, Lio/flutter/view/e;->d:Ljava/lang/String;

    .line 1106
    .line 1107
    invoke-direct {v3, v4, v2}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;-><init>(ILjava/lang/CharSequence;)V

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual {v6, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    .line 1111
    .line 1112
    .line 1113
    goto :goto_19

    .line 1114
    :cond_47
    iget-object v1, v8, Lio/flutter/view/g;->Q:Ljava/util/ArrayList;

    .line 1115
    .line 1116
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v1

    .line 1120
    :goto_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1121
    .line 1122
    .line 1123
    move-result v2

    .line 1124
    if-eqz v2, :cond_4a

    .line 1125
    .line 1126
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v2

    .line 1130
    check-cast v2, Lio/flutter/view/g;

    .line 1131
    .line 1132
    const/16 v3, 0xe

    .line 1133
    .line 1134
    invoke-virtual {v2, v3}, Lio/flutter/view/g;->i(I)Z

    .line 1135
    .line 1136
    .line 1137
    move-result v3

    .line 1138
    if-eqz v3, :cond_48

    .line 1139
    .line 1140
    goto :goto_1a

    .line 1141
    :cond_48
    iget v3, v2, Lio/flutter/view/g;->i:I

    .line 1142
    .line 1143
    const/4 v4, -0x1

    .line 1144
    if-eq v3, v4, :cond_49

    .line 1145
    .line 1146
    invoke-virtual {v13, v3}, LZ1/l;->S(I)Landroid/view/View;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v3

    .line 1150
    iget v5, v2, Lio/flutter/view/g;->i:I

    .line 1151
    .line 1152
    invoke-virtual {v13, v5}, LZ1/l;->g0(I)Z

    .line 1153
    .line 1154
    .line 1155
    move-result v5

    .line 1156
    if-nez v5, :cond_49

    .line 1157
    .line 1158
    const/4 v5, 0x0

    .line 1159
    invoke-virtual {v3, v5}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual {v6, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;)V

    .line 1163
    .line 1164
    .line 1165
    goto :goto_1a

    .line 1166
    :cond_49
    const/4 v5, 0x0

    .line 1167
    iget v2, v2, Lio/flutter/view/g;->b:I

    .line 1168
    .line 1169
    invoke-virtual {v6, v10, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;I)V

    .line 1170
    .line 1171
    .line 1172
    goto :goto_1a

    .line 1173
    :cond_4a
    return-object v6
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
.end method

.method public final d(II)Landroid/view/accessibility/AccessibilityEvent;
    .locals 2

    .line 1
    invoke-static {p2}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p0, Lio/flutter/view/k;->a:Landroid/view/View;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, v0, p1}, Landroid/view/accessibility/AccessibilityRecord;->setSource(Landroid/view/View;I)V

    .line 19
    .line 20
    .line 21
    return-object p2
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final e(Landroid/view/MotionEvent;Z)Z
    .locals 13

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x4

    .line 4
    const/4 v3, 0x1

    .line 5
    iget-object v4, p0, Lio/flutter/view/k;->c:Landroid/view/accessibility/AccessibilityManager;

    .line 6
    .line 7
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    const/4 v5, 0x0

    .line 12
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    if-nez v4, :cond_0

    .line 17
    .line 18
    return v5

    .line 19
    :cond_0
    iget-object v4, p0, Lio/flutter/view/k;->g:Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/util/HashMap;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    if-eqz v7, :cond_1

    .line 26
    .line 27
    return v5

    .line 28
    :cond_1
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    check-cast v7, Lio/flutter/view/g;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    const/4 v10, 0x0

    .line 43
    const/high16 v11, 0x3f800000    # 1.0f

    .line 44
    .line 45
    new-array v12, v2, [F

    .line 46
    .line 47
    aput v8, v12, v5

    .line 48
    .line 49
    aput v9, v12, v3

    .line 50
    .line 51
    aput v10, v12, v1

    .line 52
    .line 53
    aput v11, v12, v0

    .line 54
    .line 55
    invoke-virtual {v7, v12, p2}, Lio/flutter/view/g;->j([FZ)Lio/flutter/view/g;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    if-eqz v7, :cond_3

    .line 60
    .line 61
    iget v8, v7, Lio/flutter/view/g;->i:I

    .line 62
    .line 63
    const/4 v9, -0x1

    .line 64
    if-eq v8, v9, :cond_3

    .line 65
    .line 66
    if-eqz p2, :cond_2

    .line 67
    .line 68
    return v5

    .line 69
    :cond_2
    iget p2, v7, Lio/flutter/view/g;->b:I

    .line 70
    .line 71
    iget-object v0, p0, Lio/flutter/view/k;->d:Lio/flutter/view/AccessibilityViewEmbedder;

    .line 72
    .line 73
    invoke-virtual {v0, p2, p1}, Lio/flutter/view/AccessibilityViewEmbedder;->onAccessibilityHoverEvent(ILandroid/view/MotionEvent;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    return p1

    .line 78
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    const/16 v8, 0x9

    .line 83
    .line 84
    const/16 v9, 0x100

    .line 85
    .line 86
    if-eq v7, v8, :cond_6

    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    const/4 v8, 0x7

    .line 93
    if-ne v7, v8, :cond_4

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    const/16 v0, 0xa

    .line 101
    .line 102
    if-ne p2, v0, :cond_5

    .line 103
    .line 104
    iget-object p1, p0, Lio/flutter/view/k;->o:Lio/flutter/view/g;

    .line 105
    .line 106
    if-eqz p1, :cond_a

    .line 107
    .line 108
    iget p1, p1, Lio/flutter/view/g;->b:I

    .line 109
    .line 110
    invoke-virtual {p0, p1, v9}, Lio/flutter/view/k;->g(II)V

    .line 111
    .line 112
    .line 113
    const/4 p1, 0x0

    .line 114
    iput-object p1, p0, Lio/flutter/view/k;->o:Lio/flutter/view/g;

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    return v5

    .line 121
    :cond_6
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    invoke-virtual {v4}, Ljava/util/HashMap;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    if-eqz v8, :cond_7

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_7
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    check-cast v4, Lio/flutter/view/g;

    .line 141
    .line 142
    new-array v2, v2, [F

    .line 143
    .line 144
    aput v7, v2, v5

    .line 145
    .line 146
    aput p1, v2, v3

    .line 147
    .line 148
    aput v10, v2, v1

    .line 149
    .line 150
    aput v11, v2, v0

    .line 151
    .line 152
    invoke-virtual {v4, v2, p2}, Lio/flutter/view/g;->j([FZ)Lio/flutter/view/g;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    iget-object p2, p0, Lio/flutter/view/k;->o:Lio/flutter/view/g;

    .line 157
    .line 158
    if-eq p1, p2, :cond_a

    .line 159
    .line 160
    if-eqz p1, :cond_8

    .line 161
    .line 162
    iget p2, p1, Lio/flutter/view/g;->b:I

    .line 163
    .line 164
    const/16 v0, 0x80

    .line 165
    .line 166
    invoke-virtual {p0, p2, v0}, Lio/flutter/view/k;->g(II)V

    .line 167
    .line 168
    .line 169
    :cond_8
    iget-object p2, p0, Lio/flutter/view/k;->o:Lio/flutter/view/g;

    .line 170
    .line 171
    if-eqz p2, :cond_9

    .line 172
    .line 173
    iget p2, p2, Lio/flutter/view/g;->b:I

    .line 174
    .line 175
    invoke-virtual {p0, p2, v9}, Lio/flutter/view/k;->g(II)V

    .line 176
    .line 177
    .line 178
    :cond_9
    iput-object p1, p0, Lio/flutter/view/k;->o:Lio/flutter/view/g;

    .line 179
    .line 180
    :cond_a
    :goto_1
    return v3
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
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
.end method

.method public final f(Lio/flutter/view/g;ILandroid/os/Bundle;Z)Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    const-string v4, "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"

    .line 10
    .line 11
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const-string v5, "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"

    .line 16
    .line 17
    invoke-virtual {v3, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    iget v5, v1, Lio/flutter/view/g;->g:I

    .line 22
    .line 23
    iget v6, v1, Lio/flutter/view/g;->h:I

    .line 24
    .line 25
    const/16 v7, 0x10

    .line 26
    .line 27
    const/16 v8, 0x8

    .line 28
    .line 29
    const/4 v9, 0x4

    .line 30
    const/4 v10, 0x0

    .line 31
    const/4 v11, 0x2

    .line 32
    const/4 v12, 0x1

    .line 33
    if-ltz v6, :cond_d

    .line 34
    .line 35
    if-gez v5, :cond_0

    .line 36
    .line 37
    goto/16 :goto_1

    .line 38
    .line 39
    :cond_0
    if-eq v4, v12, :cond_a

    .line 40
    .line 41
    if-eq v4, v11, :cond_7

    .line 42
    .line 43
    if-eq v4, v9, :cond_3

    .line 44
    .line 45
    if-eq v4, v8, :cond_1

    .line 46
    .line 47
    if-eq v4, v7, :cond_1

    .line 48
    .line 49
    goto/16 :goto_0

    .line 50
    .line 51
    :cond_1
    if-eqz p4, :cond_2

    .line 52
    .line 53
    iget-object v13, v1, Lio/flutter/view/g;->r:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result v13

    .line 59
    iput v13, v1, Lio/flutter/view/g;->h:I

    .line 60
    .line 61
    goto/16 :goto_0

    .line 62
    .line 63
    :cond_2
    iput v10, v1, Lio/flutter/view/g;->h:I

    .line 64
    .line 65
    goto/16 :goto_0

    .line 66
    .line 67
    :cond_3
    if-eqz p4, :cond_5

    .line 68
    .line 69
    iget-object v13, v1, Lio/flutter/view/g;->r:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 72
    .line 73
    .line 74
    move-result v13

    .line 75
    if-ge v6, v13, :cond_5

    .line 76
    .line 77
    const-string v13, "(?!^)(\\n)"

    .line 78
    .line 79
    invoke-static {v13}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 80
    .line 81
    .line 82
    move-result-object v13

    .line 83
    iget-object v14, v1, Lio/flutter/view/g;->r:Ljava/lang/String;

    .line 84
    .line 85
    iget v15, v1, Lio/flutter/view/g;->h:I

    .line 86
    .line 87
    invoke-virtual {v14, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v14

    .line 91
    invoke-virtual {v13, v14}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 92
    .line 93
    .line 94
    move-result-object v13

    .line 95
    invoke-virtual {v13}, Ljava/util/regex/Matcher;->find()Z

    .line 96
    .line 97
    .line 98
    move-result v14

    .line 99
    if-eqz v14, :cond_4

    .line 100
    .line 101
    invoke-virtual {v13, v12}, Ljava/util/regex/Matcher;->start(I)I

    .line 102
    .line 103
    .line 104
    move-result v13

    .line 105
    iget v14, v1, Lio/flutter/view/g;->h:I

    .line 106
    .line 107
    add-int/2addr v14, v13

    .line 108
    iput v14, v1, Lio/flutter/view/g;->h:I

    .line 109
    .line 110
    goto/16 :goto_0

    .line 111
    .line 112
    :cond_4
    iget-object v13, v1, Lio/flutter/view/g;->r:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 115
    .line 116
    .line 117
    move-result v13

    .line 118
    iput v13, v1, Lio/flutter/view/g;->h:I

    .line 119
    .line 120
    goto/16 :goto_0

    .line 121
    .line 122
    :cond_5
    if-nez p4, :cond_c

    .line 123
    .line 124
    iget v13, v1, Lio/flutter/view/g;->h:I

    .line 125
    .line 126
    if-lez v13, :cond_c

    .line 127
    .line 128
    const-string v13, "(?s:.*)(\\n)"

    .line 129
    .line 130
    invoke-static {v13}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 131
    .line 132
    .line 133
    move-result-object v13

    .line 134
    iget-object v14, v1, Lio/flutter/view/g;->r:Ljava/lang/String;

    .line 135
    .line 136
    iget v15, v1, Lio/flutter/view/g;->h:I

    .line 137
    .line 138
    invoke-virtual {v14, v10, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v14

    .line 142
    invoke-virtual {v13, v14}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 143
    .line 144
    .line 145
    move-result-object v13

    .line 146
    invoke-virtual {v13}, Ljava/util/regex/Matcher;->find()Z

    .line 147
    .line 148
    .line 149
    move-result v14

    .line 150
    if-eqz v14, :cond_6

    .line 151
    .line 152
    invoke-virtual {v13, v12}, Ljava/util/regex/Matcher;->start(I)I

    .line 153
    .line 154
    .line 155
    move-result v13

    .line 156
    iput v13, v1, Lio/flutter/view/g;->h:I

    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :cond_6
    iput v10, v1, Lio/flutter/view/g;->h:I

    .line 161
    .line 162
    goto/16 :goto_0

    .line 163
    .line 164
    :cond_7
    if-eqz p4, :cond_9

    .line 165
    .line 166
    iget-object v13, v1, Lio/flutter/view/g;->r:Ljava/lang/String;

    .line 167
    .line 168
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 169
    .line 170
    .line 171
    move-result v13

    .line 172
    if-ge v6, v13, :cond_9

    .line 173
    .line 174
    const-string v13, "\\p{L}(\\b)"

    .line 175
    .line 176
    invoke-static {v13}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 177
    .line 178
    .line 179
    move-result-object v13

    .line 180
    iget-object v14, v1, Lio/flutter/view/g;->r:Ljava/lang/String;

    .line 181
    .line 182
    iget v15, v1, Lio/flutter/view/g;->h:I

    .line 183
    .line 184
    invoke-virtual {v14, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v14

    .line 188
    invoke-virtual {v13, v14}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 189
    .line 190
    .line 191
    move-result-object v13

    .line 192
    invoke-virtual {v13}, Ljava/util/regex/Matcher;->find()Z

    .line 193
    .line 194
    .line 195
    invoke-virtual {v13}, Ljava/util/regex/Matcher;->find()Z

    .line 196
    .line 197
    .line 198
    move-result v14

    .line 199
    if-eqz v14, :cond_8

    .line 200
    .line 201
    invoke-virtual {v13, v12}, Ljava/util/regex/Matcher;->start(I)I

    .line 202
    .line 203
    .line 204
    move-result v13

    .line 205
    iget v14, v1, Lio/flutter/view/g;->h:I

    .line 206
    .line 207
    add-int/2addr v14, v13

    .line 208
    iput v14, v1, Lio/flutter/view/g;->h:I

    .line 209
    .line 210
    goto :goto_0

    .line 211
    :cond_8
    iget-object v13, v1, Lio/flutter/view/g;->r:Ljava/lang/String;

    .line 212
    .line 213
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 214
    .line 215
    .line 216
    move-result v13

    .line 217
    iput v13, v1, Lio/flutter/view/g;->h:I

    .line 218
    .line 219
    goto :goto_0

    .line 220
    :cond_9
    if-nez p4, :cond_c

    .line 221
    .line 222
    iget v13, v1, Lio/flutter/view/g;->h:I

    .line 223
    .line 224
    if-lez v13, :cond_c

    .line 225
    .line 226
    const-string v13, "(?s:.*)(\\b)\\p{L}"

    .line 227
    .line 228
    invoke-static {v13}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 229
    .line 230
    .line 231
    move-result-object v13

    .line 232
    iget-object v14, v1, Lio/flutter/view/g;->r:Ljava/lang/String;

    .line 233
    .line 234
    iget v15, v1, Lio/flutter/view/g;->h:I

    .line 235
    .line 236
    invoke-virtual {v14, v10, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v14

    .line 240
    invoke-virtual {v13, v14}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 241
    .line 242
    .line 243
    move-result-object v13

    .line 244
    invoke-virtual {v13}, Ljava/util/regex/Matcher;->find()Z

    .line 245
    .line 246
    .line 247
    move-result v14

    .line 248
    if-eqz v14, :cond_c

    .line 249
    .line 250
    invoke-virtual {v13, v12}, Ljava/util/regex/Matcher;->start(I)I

    .line 251
    .line 252
    .line 253
    move-result v13

    .line 254
    iput v13, v1, Lio/flutter/view/g;->h:I

    .line 255
    .line 256
    goto :goto_0

    .line 257
    :cond_a
    if-eqz p4, :cond_b

    .line 258
    .line 259
    iget-object v13, v1, Lio/flutter/view/g;->r:Ljava/lang/String;

    .line 260
    .line 261
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 262
    .line 263
    .line 264
    move-result v13

    .line 265
    if-ge v6, v13, :cond_b

    .line 266
    .line 267
    iget v13, v1, Lio/flutter/view/g;->h:I

    .line 268
    .line 269
    add-int/2addr v13, v12

    .line 270
    iput v13, v1, Lio/flutter/view/g;->h:I

    .line 271
    .line 272
    goto :goto_0

    .line 273
    :cond_b
    if-nez p4, :cond_c

    .line 274
    .line 275
    iget v13, v1, Lio/flutter/view/g;->h:I

    .line 276
    .line 277
    if-lez v13, :cond_c

    .line 278
    .line 279
    sub-int/2addr v13, v12

    .line 280
    iput v13, v1, Lio/flutter/view/g;->h:I

    .line 281
    .line 282
    :cond_c
    :goto_0
    if-nez v3, :cond_d

    .line 283
    .line 284
    iget v13, v1, Lio/flutter/view/g;->h:I

    .line 285
    .line 286
    iput v13, v1, Lio/flutter/view/g;->g:I

    .line 287
    .line 288
    :cond_d
    :goto_1
    iget v13, v1, Lio/flutter/view/g;->g:I

    .line 289
    .line 290
    if-ne v5, v13, :cond_e

    .line 291
    .line 292
    iget v5, v1, Lio/flutter/view/g;->h:I

    .line 293
    .line 294
    if-eq v6, v5, :cond_10

    .line 295
    .line 296
    :cond_e
    iget-object v5, v1, Lio/flutter/view/g;->r:Ljava/lang/String;

    .line 297
    .line 298
    if-eqz v5, :cond_f

    .line 299
    .line 300
    goto :goto_2

    .line 301
    :cond_f
    const-string v5, ""

    .line 302
    .line 303
    :goto_2
    iget v6, v1, Lio/flutter/view/g;->b:I

    .line 304
    .line 305
    const/16 v13, 0x2000

    .line 306
    .line 307
    invoke-virtual {v0, v6, v13}, Lio/flutter/view/k;->d(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 308
    .line 309
    .line 310
    move-result-object v6

    .line 311
    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 312
    .line 313
    .line 314
    move-result-object v13

    .line 315
    invoke-interface {v13, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    iget v13, v1, Lio/flutter/view/g;->g:I

    .line 319
    .line 320
    invoke-virtual {v6, v13}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 321
    .line 322
    .line 323
    iget v13, v1, Lio/flutter/view/g;->h:I

    .line 324
    .line 325
    invoke-virtual {v6, v13}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    invoke-virtual {v6, v5}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0, v6}, Lio/flutter/view/k;->h(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 336
    .line 337
    .line 338
    :cond_10
    iget-object v5, v0, Lio/flutter/view/k;->b:LZ1/m;

    .line 339
    .line 340
    if-eq v4, v12, :cond_14

    .line 341
    .line 342
    if-eq v4, v11, :cond_12

    .line 343
    .line 344
    if-eq v4, v9, :cond_11

    .line 345
    .line 346
    if-eq v4, v8, :cond_11

    .line 347
    .line 348
    if-eq v4, v7, :cond_11

    .line 349
    .line 350
    goto :goto_3

    .line 351
    :cond_11
    return v12

    .line 352
    :cond_12
    if-eqz p4, :cond_13

    .line 353
    .line 354
    sget-object v4, Lio/flutter/view/d;->F:Lio/flutter/view/d;

    .line 355
    .line 356
    invoke-static {v1, v4}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 357
    .line 358
    .line 359
    move-result v6

    .line 360
    if-eqz v6, :cond_13

    .line 361
    .line 362
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    invoke-virtual {v5, v2, v4, v1}, LZ1/m;->p(ILio/flutter/view/d;Ljava/io/Serializable;)V

    .line 367
    .line 368
    .line 369
    return v12

    .line 370
    :cond_13
    if-nez p4, :cond_16

    .line 371
    .line 372
    sget-object v4, Lio/flutter/view/d;->G:Lio/flutter/view/d;

    .line 373
    .line 374
    invoke-static {v1, v4}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    if-eqz v1, :cond_16

    .line 379
    .line 380
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    invoke-virtual {v5, v2, v4, v1}, LZ1/m;->p(ILio/flutter/view/d;Ljava/io/Serializable;)V

    .line 385
    .line 386
    .line 387
    return v12

    .line 388
    :cond_14
    if-eqz p4, :cond_15

    .line 389
    .line 390
    sget-object v4, Lio/flutter/view/d;->v:Lio/flutter/view/d;

    .line 391
    .line 392
    invoke-static {v1, v4}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 393
    .line 394
    .line 395
    move-result v6

    .line 396
    if-eqz v6, :cond_15

    .line 397
    .line 398
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    invoke-virtual {v5, v2, v4, v1}, LZ1/m;->p(ILio/flutter/view/d;Ljava/io/Serializable;)V

    .line 403
    .line 404
    .line 405
    return v12

    .line 406
    :cond_15
    if-nez p4, :cond_16

    .line 407
    .line 408
    sget-object v4, Lio/flutter/view/d;->w:Lio/flutter/view/d;

    .line 409
    .line 410
    invoke-static {v1, v4}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    if-eqz v1, :cond_16

    .line 415
    .line 416
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    invoke-virtual {v5, v2, v4, v1}, LZ1/m;->p(ILio/flutter/view/d;Ljava/io/Serializable;)V

    .line 421
    .line 422
    .line 423
    return v12

    .line 424
    :cond_16
    :goto_3
    return v10
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
.end method

.method public final findFocus(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_0

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p1, v0, :cond_2

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object p1, p0, Lio/flutter/view/k;->m:Lio/flutter/view/g;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget p1, p1, Lio/flutter/view/g;->b:I

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lio/flutter/view/k;->createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_1
    iget-object p1, p0, Lio/flutter/view/k;->k:Ljava/lang/Integer;

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {p0, p1}, Lio/flutter/view/k;->createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_2
    iget-object p1, p0, Lio/flutter/view/k;->i:Lio/flutter/view/g;

    .line 33
    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    iget p1, p1, Lio/flutter/view/g;->b:I

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lio/flutter/view/k;->createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :cond_3
    iget-object p1, p0, Lio/flutter/view/k;->j:Ljava/lang/Integer;

    .line 44
    .line 45
    if-eqz p1, :cond_4

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {p0, p1}, Lio/flutter/view/k;->createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1

    .line 56
    :cond_4
    :goto_0
    const/4 p1, 0x0

    .line 57
    return-object p1
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public final g(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/flutter/view/k;->c:Landroid/view/accessibility/AccessibilityManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/flutter/view/k;->d(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0, p1}, Lio/flutter/view/k;->h(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 15
    .line 16
    .line 17
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final h(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/view/k;->c:Landroid/view/accessibility/AccessibilityManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lio/flutter/view/k;->a:Landroid/view/View;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1, v0, p1}, Landroid/view/ViewParent;->requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 17
    .line 18
    .line 19
    return-void
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

.method public final i(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/flutter/view/k;->s:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-boolean p1, p0, Lio/flutter/view/k;->s:Z

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    iget p1, p0, Lio/flutter/view/k;->l:I

    .line 11
    .line 12
    or-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    iput p1, p0, Lio/flutter/view/k;->l:I

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget p1, p0, Lio/flutter/view/k;->l:I

    .line 18
    .line 19
    and-int/lit8 p1, p1, -0x2

    .line 20
    .line 21
    iput p1, p0, Lio/flutter/view/k;->l:I

    .line 22
    .line 23
    :goto_0
    iget p1, p0, Lio/flutter/view/k;->l:I

    .line 24
    .line 25
    iget-object v0, p0, Lio/flutter/view/k;->b:LZ1/m;

    .line 26
    .line 27
    iget-object v0, v0, LZ1/m;->n:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lio/flutter/embedding/engine/FlutterJNI;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lio/flutter/embedding/engine/FlutterJNI;->setAccessibilityFeatures(I)V

    .line 32
    .line 33
    .line 34
    return-void
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

.method public final j(Lio/flutter/view/g;)Z
    .locals 2

    .line 1
    iget v0, p1, Lio/flutter/view/g;->j:I

    .line 2
    .line 3
    if-lez v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, Lio/flutter/view/k;->i:Lio/flutter/view/g;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-object v0, v0, Lio/flutter/view/g;->P:Lio/flutter/view/g;

    .line 11
    .line 12
    :goto_0
    if-eqz v0, :cond_1

    .line 13
    .line 14
    if-ne v0, p1, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    iget-object v0, v0, Lio/flutter/view/g;->P:Lio/flutter/view/g;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-object v0, v1

    .line 21
    :goto_1
    if-eqz v0, :cond_2

    .line 22
    .line 23
    goto :goto_4

    .line 24
    :cond_2
    iget-object p1, p0, Lio/flutter/view/k;->i:Lio/flutter/view/g;

    .line 25
    .line 26
    if-eqz p1, :cond_5

    .line 27
    .line 28
    iget-object p1, p1, Lio/flutter/view/g;->P:Lio/flutter/view/g;

    .line 29
    .line 30
    :goto_2
    if-eqz p1, :cond_4

    .line 31
    .line 32
    const/16 v0, 0x13

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lio/flutter/view/g;->i(I)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    move-object v1, p1

    .line 41
    goto :goto_3

    .line 42
    :cond_3
    iget-object p1, p1, Lio/flutter/view/g;->P:Lio/flutter/view/g;

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_4
    :goto_3
    if-eqz v1, :cond_5

    .line 46
    .line 47
    goto :goto_5

    .line 48
    :cond_5
    :goto_4
    const/4 p1, 0x1

    .line 49
    goto :goto_6

    .line 50
    :cond_6
    :goto_5
    const/4 p1, 0x0

    .line 51
    :goto_6
    return p1
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

.method public final performAction(IILandroid/os/Bundle;)Z
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/high16 v1, 0x10000

    .line 3
    .line 4
    if-lt p1, v1, :cond_1

    .line 5
    .line 6
    iget-object v1, p0, Lio/flutter/view/k;->d:Lio/flutter/view/AccessibilityViewEmbedder;

    .line 7
    .line 8
    invoke-virtual {v1, p1, p2, p3}, Lio/flutter/view/AccessibilityViewEmbedder;->performAction(IILandroid/os/Bundle;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/16 p3, 0x80

    .line 15
    .line 16
    if-ne p2, p3, :cond_0

    .line 17
    .line 18
    iput-object v0, p0, Lio/flutter/view/k;->j:Ljava/lang/Integer;

    .line 19
    .line 20
    :cond_0
    return p1

    .line 21
    :cond_1
    iget-object v2, p0, Lio/flutter/view/k;->g:Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Lio/flutter/view/g;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    if-nez v3, :cond_2

    .line 35
    .line 36
    return v4

    .line 37
    :cond_2
    sget-object v5, Lio/flutter/view/d;->s:Lio/flutter/view/d;

    .line 38
    .line 39
    sget-object v6, Lio/flutter/view/d;->t:Lio/flutter/view/d;

    .line 40
    .line 41
    const/4 v7, 0x4

    .line 42
    const/4 v8, 0x1

    .line 43
    iget-object v9, p0, Lio/flutter/view/k;->b:LZ1/m;

    .line 44
    .line 45
    sparse-switch p2, :sswitch_data_0

    .line 46
    .line 47
    .line 48
    const p3, 0xff00001

    .line 49
    .line 50
    .line 51
    sub-int/2addr p2, p3

    .line 52
    iget-object p3, p0, Lio/flutter/view/k;->h:Ljava/util/HashMap;

    .line 53
    .line 54
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-virtual {p3, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    check-cast p2, Lio/flutter/view/e;

    .line 63
    .line 64
    if-eqz p2, :cond_3

    .line 65
    .line 66
    sget-object p3, Lio/flutter/view/d;->D:Lio/flutter/view/d;

    .line 67
    .line 68
    iget p2, p2, Lio/flutter/view/e;->b:I

    .line 69
    .line 70
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-virtual {v9, p1, p3, p2}, LZ1/m;->p(ILio/flutter/view/d;Ljava/io/Serializable;)V

    .line 75
    .line 76
    .line 77
    return v8

    .line 78
    :cond_3
    return v4

    .line 79
    :sswitch_0
    sget-object p2, Lio/flutter/view/d;->u:Lio/flutter/view/d;

    .line 80
    .line 81
    invoke-virtual {v9, p1, p2}, LZ1/m;->o(ILio/flutter/view/d;)V

    .line 82
    .line 83
    .line 84
    return v8

    .line 85
    :sswitch_1
    if-eqz p3, :cond_4

    .line 86
    .line 87
    const-string p2, "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"

    .line 88
    .line 89
    invoke-virtual {p3, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_4

    .line 94
    .line 95
    invoke-virtual {p3, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    goto :goto_0

    .line 100
    :cond_4
    const-string p2, ""

    .line 101
    .line 102
    :goto_0
    sget-object p3, Lio/flutter/view/d;->H:Lio/flutter/view/d;

    .line 103
    .line 104
    invoke-virtual {v9, p1, p3, p2}, LZ1/m;->p(ILio/flutter/view/d;Ljava/io/Serializable;)V

    .line 105
    .line 106
    .line 107
    iput-object p2, v3, Lio/flutter/view/g;->r:Ljava/lang/String;

    .line 108
    .line 109
    iput-object v0, v3, Lio/flutter/view/g;->s:Ljava/util/ArrayList;

    .line 110
    .line 111
    return v8

    .line 112
    :sswitch_2
    sget-object p2, Lio/flutter/view/d;->E:Lio/flutter/view/d;

    .line 113
    .line 114
    invoke-virtual {v9, p1, p2}, LZ1/m;->o(ILio/flutter/view/d;)V

    .line 115
    .line 116
    .line 117
    return v8

    .line 118
    :sswitch_3
    new-instance p2, Ljava/util/HashMap;

    .line 119
    .line 120
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 121
    .line 122
    .line 123
    const-string v0, "extent"

    .line 124
    .line 125
    const-string v1, "base"

    .line 126
    .line 127
    if-eqz p3, :cond_5

    .line 128
    .line 129
    const-string v4, "ACTION_ARGUMENT_SELECTION_START_INT"

    .line 130
    .line 131
    invoke-virtual {p3, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    if-eqz v5, :cond_5

    .line 136
    .line 137
    const-string v5, "ACTION_ARGUMENT_SELECTION_END_INT"

    .line 138
    .line 139
    invoke-virtual {p3, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-eqz v6, :cond_5

    .line 144
    .line 145
    invoke-virtual {p3, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    invoke-virtual {p2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p3, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 157
    .line 158
    .line 159
    move-result p3

    .line 160
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object p3

    .line 164
    invoke-virtual {p2, v0, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_5
    iget p3, v3, Lio/flutter/view/g;->h:I

    .line 169
    .line 170
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object p3

    .line 174
    invoke-virtual {p2, v1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    iget p3, v3, Lio/flutter/view/g;->h:I

    .line 178
    .line 179
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object p3

    .line 183
    invoke-virtual {p2, v0, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    :goto_1
    sget-object p3, Lio/flutter/view/d;->x:Lio/flutter/view/d;

    .line 187
    .line 188
    invoke-virtual {v9, p1, p3, p2}, LZ1/m;->p(ILio/flutter/view/d;Ljava/io/Serializable;)V

    .line 189
    .line 190
    .line 191
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    check-cast p1, Lio/flutter/view/g;

    .line 200
    .line 201
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p3

    .line 205
    check-cast p3, Ljava/lang/Integer;

    .line 206
    .line 207
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 208
    .line 209
    .line 210
    move-result p3

    .line 211
    iput p3, p1, Lio/flutter/view/g;->g:I

    .line 212
    .line 213
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    check-cast p2, Ljava/lang/Integer;

    .line 218
    .line 219
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 220
    .line 221
    .line 222
    move-result p2

    .line 223
    iput p2, p1, Lio/flutter/view/g;->h:I

    .line 224
    .line 225
    return v8

    .line 226
    :sswitch_4
    sget-object p2, Lio/flutter/view/d;->z:Lio/flutter/view/d;

    .line 227
    .line 228
    invoke-virtual {v9, p1, p2}, LZ1/m;->o(ILio/flutter/view/d;)V

    .line 229
    .line 230
    .line 231
    return v8

    .line 232
    :sswitch_5
    sget-object p2, Lio/flutter/view/d;->A:Lio/flutter/view/d;

    .line 233
    .line 234
    invoke-virtual {v9, p1, p2}, LZ1/m;->o(ILio/flutter/view/d;)V

    .line 235
    .line 236
    .line 237
    return v8

    .line 238
    :sswitch_6
    sget-object p2, Lio/flutter/view/d;->y:Lio/flutter/view/d;

    .line 239
    .line 240
    invoke-virtual {v9, p1, p2}, LZ1/m;->o(ILio/flutter/view/d;)V

    .line 241
    .line 242
    .line 243
    return v8

    .line 244
    :sswitch_7
    sget-object p2, Lio/flutter/view/d;->r:Lio/flutter/view/d;

    .line 245
    .line 246
    invoke-static {v3, p2}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 247
    .line 248
    .line 249
    move-result p3

    .line 250
    if-eqz p3, :cond_6

    .line 251
    .line 252
    invoke-virtual {v9, p1, p2}, LZ1/m;->o(ILio/flutter/view/d;)V

    .line 253
    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_6
    sget-object p2, Lio/flutter/view/d;->p:Lio/flutter/view/d;

    .line 257
    .line 258
    invoke-static {v3, p2}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 259
    .line 260
    .line 261
    move-result p3

    .line 262
    if-eqz p3, :cond_7

    .line 263
    .line 264
    invoke-virtual {v9, p1, p2}, LZ1/m;->o(ILio/flutter/view/d;)V

    .line 265
    .line 266
    .line 267
    goto :goto_2

    .line 268
    :cond_7
    invoke-static {v3, v6}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 269
    .line 270
    .line 271
    move-result p2

    .line 272
    if-eqz p2, :cond_8

    .line 273
    .line 274
    iget-object p2, v3, Lio/flutter/view/g;->v:Ljava/lang/String;

    .line 275
    .line 276
    iput-object p2, v3, Lio/flutter/view/g;->r:Ljava/lang/String;

    .line 277
    .line 278
    iget-object p2, v3, Lio/flutter/view/g;->w:Ljava/util/ArrayList;

    .line 279
    .line 280
    iput-object p2, v3, Lio/flutter/view/g;->s:Ljava/util/ArrayList;

    .line 281
    .line 282
    invoke-virtual {p0, p1, v7}, Lio/flutter/view/k;->g(II)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v9, p1, v6}, LZ1/m;->o(ILio/flutter/view/d;)V

    .line 286
    .line 287
    .line 288
    :goto_2
    return v8

    .line 289
    :cond_8
    return v4

    .line 290
    :sswitch_8
    sget-object p2, Lio/flutter/view/d;->q:Lio/flutter/view/d;

    .line 291
    .line 292
    invoke-static {v3, p2}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 293
    .line 294
    .line 295
    move-result p3

    .line 296
    if-eqz p3, :cond_9

    .line 297
    .line 298
    invoke-virtual {v9, p1, p2}, LZ1/m;->o(ILio/flutter/view/d;)V

    .line 299
    .line 300
    .line 301
    goto :goto_3

    .line 302
    :cond_9
    sget-object p2, Lio/flutter/view/d;->o:Lio/flutter/view/d;

    .line 303
    .line 304
    invoke-static {v3, p2}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 305
    .line 306
    .line 307
    move-result p3

    .line 308
    if-eqz p3, :cond_a

    .line 309
    .line 310
    invoke-virtual {v9, p1, p2}, LZ1/m;->o(ILio/flutter/view/d;)V

    .line 311
    .line 312
    .line 313
    goto :goto_3

    .line 314
    :cond_a
    invoke-static {v3, v5}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 315
    .line 316
    .line 317
    move-result p2

    .line 318
    if-eqz p2, :cond_b

    .line 319
    .line 320
    iget-object p2, v3, Lio/flutter/view/g;->t:Ljava/lang/String;

    .line 321
    .line 322
    iput-object p2, v3, Lio/flutter/view/g;->r:Ljava/lang/String;

    .line 323
    .line 324
    iget-object p2, v3, Lio/flutter/view/g;->u:Ljava/util/ArrayList;

    .line 325
    .line 326
    iput-object p2, v3, Lio/flutter/view/g;->s:Ljava/util/ArrayList;

    .line 327
    .line 328
    invoke-virtual {p0, p1, v7}, Lio/flutter/view/k;->g(II)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v9, p1, v5}, LZ1/m;->o(ILio/flutter/view/d;)V

    .line 332
    .line 333
    .line 334
    :goto_3
    return v8

    .line 335
    :cond_b
    return v4

    .line 336
    :sswitch_9
    invoke-virtual {p0, v3, p1, p3, v4}, Lio/flutter/view/k;->f(Lio/flutter/view/g;ILandroid/os/Bundle;Z)Z

    .line 337
    .line 338
    .line 339
    move-result p1

    .line 340
    return p1

    .line 341
    :sswitch_a
    invoke-virtual {p0, v3, p1, p3, v8}, Lio/flutter/view/k;->f(Lio/flutter/view/g;ILandroid/os/Bundle;Z)Z

    .line 342
    .line 343
    .line 344
    move-result p1

    .line 345
    return p1

    .line 346
    :sswitch_b
    iget-object p2, p0, Lio/flutter/view/k;->i:Lio/flutter/view/g;

    .line 347
    .line 348
    if-eqz p2, :cond_c

    .line 349
    .line 350
    iget p2, p2, Lio/flutter/view/g;->b:I

    .line 351
    .line 352
    if-ne p2, p1, :cond_c

    .line 353
    .line 354
    iput-object v0, p0, Lio/flutter/view/k;->i:Lio/flutter/view/g;

    .line 355
    .line 356
    :cond_c
    iget-object p2, p0, Lio/flutter/view/k;->j:Ljava/lang/Integer;

    .line 357
    .line 358
    if-eqz p2, :cond_d

    .line 359
    .line 360
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 361
    .line 362
    .line 363
    move-result p2

    .line 364
    if-ne p2, p1, :cond_d

    .line 365
    .line 366
    iput-object v0, p0, Lio/flutter/view/k;->j:Ljava/lang/Integer;

    .line 367
    .line 368
    :cond_d
    sget-object p2, Lio/flutter/view/d;->C:Lio/flutter/view/d;

    .line 369
    .line 370
    invoke-virtual {v9, p1, p2}, LZ1/m;->o(ILio/flutter/view/d;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {p0, p1, v1}, Lio/flutter/view/k;->g(II)V

    .line 374
    .line 375
    .line 376
    return v8

    .line 377
    :sswitch_c
    iget-object p2, p0, Lio/flutter/view/k;->i:Lio/flutter/view/g;

    .line 378
    .line 379
    if-nez p2, :cond_e

    .line 380
    .line 381
    iget-object p2, p0, Lio/flutter/view/k;->a:Landroid/view/View;

    .line 382
    .line 383
    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    .line 384
    .line 385
    .line 386
    :cond_e
    iput-object v3, p0, Lio/flutter/view/k;->i:Lio/flutter/view/g;

    .line 387
    .line 388
    sget-object p2, Lio/flutter/view/d;->B:Lio/flutter/view/d;

    .line 389
    .line 390
    invoke-virtual {v9, p1, p2}, LZ1/m;->o(ILio/flutter/view/d;)V

    .line 391
    .line 392
    .line 393
    new-instance p2, Ljava/util/HashMap;

    .line 394
    .line 395
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 396
    .line 397
    .line 398
    const-string p3, "type"

    .line 399
    .line 400
    const-string v1, "didGainFocus"

    .line 401
    .line 402
    invoke-virtual {p2, p3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    iget p3, v3, Lio/flutter/view/g;->b:I

    .line 406
    .line 407
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 408
    .line 409
    .line 410
    move-result-object p3

    .line 411
    const-string v1, "nodeId"

    .line 412
    .line 413
    invoke-virtual {p2, v1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    iget-object p3, v9, LZ1/m;->m:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast p3, LZ1/i;

    .line 419
    .line 420
    invoke-virtual {p3, p2, v0}, LZ1/i;->D(Ljava/lang/Object;Ln3/c;)V

    .line 421
    .line 422
    .line 423
    const p2, 0x8000

    .line 424
    .line 425
    .line 426
    invoke-virtual {p0, p1, p2}, Lio/flutter/view/k;->g(II)V

    .line 427
    .line 428
    .line 429
    invoke-static {v3, v5}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 430
    .line 431
    .line 432
    move-result p2

    .line 433
    if-nez p2, :cond_f

    .line 434
    .line 435
    invoke-static {v3, v6}, Lio/flutter/view/g;->a(Lio/flutter/view/g;Lio/flutter/view/d;)Z

    .line 436
    .line 437
    .line 438
    move-result p2

    .line 439
    if-eqz p2, :cond_10

    .line 440
    .line 441
    :cond_f
    invoke-virtual {p0, p1, v7}, Lio/flutter/view/k;->g(II)V

    .line 442
    .line 443
    .line 444
    :cond_10
    return v8

    .line 445
    :sswitch_d
    sget-object p2, Lio/flutter/view/d;->n:Lio/flutter/view/d;

    .line 446
    .line 447
    invoke-virtual {v9, p1, p2}, LZ1/m;->o(ILio/flutter/view/d;)V

    .line 448
    .line 449
    .line 450
    return v8

    .line 451
    :sswitch_e
    sget-object p2, Lio/flutter/view/d;->m:Lio/flutter/view/d;

    .line 452
    .line 453
    invoke-virtual {v9, p1, p2}, LZ1/m;->o(ILio/flutter/view/d;)V

    .line 454
    .line 455
    .line 456
    return v8

    .line 457
    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_e
        0x20 -> :sswitch_d
        0x40 -> :sswitch_c
        0x80 -> :sswitch_b
        0x100 -> :sswitch_a
        0x200 -> :sswitch_9
        0x1000 -> :sswitch_8
        0x2000 -> :sswitch_7
        0x4000 -> :sswitch_6
        0x8000 -> :sswitch_5
        0x10000 -> :sswitch_4
        0x20000 -> :sswitch_3
        0x100000 -> :sswitch_2
        0x200000 -> :sswitch_1
        0x1020036 -> :sswitch_0
    .end sparse-switch
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
.end method
