.class public final Ll1/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/q;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/util/List;

.field public final d:Ld0/p;

.field public final e:Landroid/util/SparseIntArray;

.field public final f:LA/j;

.field public final g:Lc1/j;

.field public final h:Landroid/util/SparseArray;

.field public final i:Landroid/util/SparseBooleanArray;

.field public final j:Landroid/util/SparseBooleanArray;

.field public final k:Ll1/x;

.field public l:LK0/b;

.field public m:LF0/s;

.field public n:I

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Ll1/F;

.field public s:I

.field public t:I


# direct methods
.method static constructor <clinit>()V
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
.end method

.method public constructor <init>(IILc1/j;Ld0/u;LA/j;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p5, p0, Ll1/C;->f:LA/j;

    .line 5
    .line 6
    iput p1, p0, Ll1/C;->a:I

    .line 7
    .line 8
    iput p2, p0, Ll1/C;->b:I

    .line 9
    .line 10
    iput-object p3, p0, Ll1/C;->g:Lc1/j;

    .line 11
    .line 12
    const/4 p2, 0x1

    .line 13
    if-eq p1, p2, :cond_1

    .line 14
    .line 15
    const/4 p2, 0x2

    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Ll1/C;->c:Ljava/util/List;

    .line 25
    .line 26
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    invoke-static {p4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Ll1/C;->c:Ljava/util/List;

    .line 35
    .line 36
    :goto_1
    new-instance p1, Ld0/p;

    .line 37
    .line 38
    const/16 p2, 0x24b8

    .line 39
    .line 40
    new-array p2, p2, [B

    .line 41
    .line 42
    const/4 p3, 0x0

    .line 43
    invoke-direct {p1, p3, p2}, Ld0/p;-><init>(I[B)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Ll1/C;->d:Ld0/p;

    .line 47
    .line 48
    new-instance p1, Landroid/util/SparseBooleanArray;

    .line 49
    .line 50
    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Ll1/C;->i:Landroid/util/SparseBooleanArray;

    .line 54
    .line 55
    new-instance p2, Landroid/util/SparseBooleanArray;

    .line 56
    .line 57
    invoke-direct {p2}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p2, p0, Ll1/C;->j:Landroid/util/SparseBooleanArray;

    .line 61
    .line 62
    new-instance p2, Landroid/util/SparseArray;

    .line 63
    .line 64
    invoke-direct {p2}, Landroid/util/SparseArray;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object p2, p0, Ll1/C;->h:Landroid/util/SparseArray;

    .line 68
    .line 69
    new-instance p4, Landroid/util/SparseIntArray;

    .line 70
    .line 71
    invoke-direct {p4}, Landroid/util/SparseIntArray;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object p4, p0, Ll1/C;->e:Landroid/util/SparseIntArray;

    .line 75
    .line 76
    new-instance p4, Ll1/x;

    .line 77
    .line 78
    const/4 p5, 0x1

    .line 79
    invoke-direct {p4, p5}, Ll1/x;-><init>(I)V

    .line 80
    .line 81
    .line 82
    iput-object p4, p0, Ll1/C;->k:Ll1/x;

    .line 83
    .line 84
    sget-object p4, LF0/s;->b:LA0/b;

    .line 85
    .line 86
    iput-object p4, p0, Ll1/C;->m:LF0/s;

    .line 87
    .line 88
    const/4 p4, -0x1

    .line 89
    iput p4, p0, Ll1/C;->t:I

    .line 90
    .line 91
    invoke-virtual {p1}, Landroid/util/SparseBooleanArray;->clear()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, Landroid/util/SparseArray;->clear()V

    .line 95
    .line 96
    .line 97
    new-instance p1, Landroid/util/SparseArray;

    .line 98
    .line 99
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 103
    .line 104
    .line 105
    move-result p4

    .line 106
    move p5, p3

    .line 107
    :goto_2
    if-ge p5, p4, :cond_2

    .line 108
    .line 109
    invoke-virtual {p1, p5}, Landroid/util/SparseArray;->keyAt(I)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-virtual {p1, p5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Ll1/F;

    .line 118
    .line 119
    invoke-virtual {p2, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    add-int/lit8 p5, p5, 0x1

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_2
    new-instance p1, Ll1/B;

    .line 126
    .line 127
    new-instance p4, LZ1/c;

    .line 128
    .line 129
    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    .line 130
    .line 131
    .line 132
    iput-object p0, p4, LZ1/c;->m:Ljava/lang/Object;

    .line 133
    .line 134
    new-instance p5, LF0/M;

    .line 135
    .line 136
    const/4 v0, 0x4

    .line 137
    new-array v1, v0, [B

    .line 138
    .line 139
    invoke-direct {p5, v0, v1}, LF0/M;-><init>(I[B)V

    .line 140
    .line 141
    .line 142
    iput-object p5, p4, LZ1/c;->l:Ljava/lang/Object;

    .line 143
    .line 144
    invoke-direct {p1, p4}, Ll1/B;-><init>(Ll1/A;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p2, p3, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    const/4 p1, 0x0

    .line 151
    iput-object p1, p0, Ll1/C;->r:Ll1/F;

    .line 152
    .line 153
    return-void
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
.method public final b(JJ)V
    .locals 10

    .line 1
    iget p1, p0, Ll1/C;->a:I

    .line 2
    .line 3
    const/4 p2, 0x2

    .line 4
    const/4 v0, 0x1

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eq p1, p2, :cond_0

    .line 7
    .line 8
    move p1, v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p1, v1

    .line 11
    :goto_0
    invoke-static {p1}, Ld0/m;->h(Z)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Ll1/C;->c:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    move v2, v1

    .line 21
    :goto_1
    const-wide/16 v3, 0x0

    .line 22
    .line 23
    if-ge v2, p2, :cond_5

    .line 24
    .line 25
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    check-cast v5, Ld0/u;

    .line 30
    .line 31
    monitor-enter v5

    .line 32
    :try_start_0
    iget-wide v6, v5, Ld0/u;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    monitor-exit v5

    .line 35
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    cmp-long v6, v6, v8

    .line 41
    .line 42
    if-nez v6, :cond_1

    .line 43
    .line 44
    move v6, v0

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    move v6, v1

    .line 47
    :goto_2
    if-nez v6, :cond_3

    .line 48
    .line 49
    invoke-virtual {v5}, Ld0/u;->d()J

    .line 50
    .line 51
    .line 52
    move-result-wide v6

    .line 53
    cmp-long v8, v6, v8

    .line 54
    .line 55
    if-eqz v8, :cond_2

    .line 56
    .line 57
    cmp-long v3, v6, v3

    .line 58
    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    cmp-long v3, v6, p3

    .line 62
    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    move v6, v0

    .line 66
    goto :goto_3

    .line 67
    :cond_2
    move v6, v1

    .line 68
    :cond_3
    :goto_3
    if-eqz v6, :cond_4

    .line 69
    .line 70
    invoke-virtual {v5, p3, p4}, Ld0/u;->f(J)V

    .line 71
    .line 72
    .line 73
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :catchall_0
    move-exception p1

    .line 77
    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    throw p1

    .line 79
    :cond_5
    cmp-long p1, p3, v3

    .line 80
    .line 81
    if-eqz p1, :cond_6

    .line 82
    .line 83
    iget-object p1, p0, Ll1/C;->l:LK0/b;

    .line 84
    .line 85
    if-eqz p1, :cond_6

    .line 86
    .line 87
    invoke-virtual {p1, p3, p4}, LK0/b;->d(J)V

    .line 88
    .line 89
    .line 90
    :cond_6
    iget-object p1, p0, Ll1/C;->d:Ld0/p;

    .line 91
    .line 92
    invoke-virtual {p1, v1}, Ld0/p;->E(I)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Ll1/C;->e:Landroid/util/SparseIntArray;

    .line 96
    .line 97
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 98
    .line 99
    .line 100
    move p1, v1

    .line 101
    :goto_4
    iget-object p2, p0, Ll1/C;->h:Landroid/util/SparseArray;

    .line 102
    .line 103
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    .line 104
    .line 105
    .line 106
    move-result p3

    .line 107
    if-ge p1, p3, :cond_7

    .line 108
    .line 109
    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    check-cast p2, Ll1/F;

    .line 114
    .line 115
    invoke-interface {p2}, Ll1/F;->a()V

    .line 116
    .line 117
    .line 118
    add-int/lit8 p1, p1, 0x1

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_7
    iput v1, p0, Ll1/C;->s:I

    .line 122
    .line 123
    return-void
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

.method public final d(LF0/r;LF0/u;)I
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    check-cast v2, LF0/m;

    .line 8
    .line 9
    iget-wide v14, v2, LF0/m;->n:J

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v12, 0x1

    .line 13
    iget v13, v0, Ll1/C;->a:I

    .line 14
    .line 15
    const/4 v10, 0x2

    .line 16
    if-ne v13, v10, :cond_0

    .line 17
    .line 18
    move/from16 v17, v12

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move/from16 v17, v2

    .line 22
    .line 23
    :goto_0
    iget-boolean v3, v0, Ll1/C;->o:Z

    .line 24
    .line 25
    const/16 v11, 0x47

    .line 26
    .line 27
    const-wide/16 v18, -0x1

    .line 28
    .line 29
    if-eqz v3, :cond_14

    .line 30
    .line 31
    cmp-long v3, v14, v18

    .line 32
    .line 33
    iget-object v6, v0, Ll1/C;->k:Ll1/x;

    .line 34
    .line 35
    if-eqz v3, :cond_10

    .line 36
    .line 37
    if-nez v17, :cond_10

    .line 38
    .line 39
    iget-boolean v3, v6, Ll1/x;->d:Z

    .line 40
    .line 41
    if-nez v3, :cond_10

    .line 42
    .line 43
    iget v3, v0, Ll1/C;->t:I

    .line 44
    .line 45
    if-gtz v3, :cond_1

    .line 46
    .line 47
    move-object/from16 v1, p1

    .line 48
    .line 49
    check-cast v1, LF0/m;

    .line 50
    .line 51
    invoke-virtual {v6, v1}, Ll1/x;->a(LF0/m;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_9

    .line 55
    .line 56
    :cond_1
    iget-boolean v7, v6, Ll1/x;->f:Z

    .line 57
    .line 58
    iget-object v8, v6, Ll1/x;->c:Ld0/p;

    .line 59
    .line 60
    const v9, 0x1b8a0

    .line 61
    .line 62
    .line 63
    if-nez v7, :cond_8

    .line 64
    .line 65
    move-object/from16 v7, p1

    .line 66
    .line 67
    check-cast v7, LF0/m;

    .line 68
    .line 69
    int-to-long v9, v9

    .line 70
    iget-wide v13, v7, LF0/m;->n:J

    .line 71
    .line 72
    invoke-static {v9, v10, v13, v14}, Ljava/lang/Math;->min(JJ)J

    .line 73
    .line 74
    .line 75
    move-result-wide v9

    .line 76
    long-to-int v9, v9

    .line 77
    int-to-long v4, v9

    .line 78
    sub-long/2addr v13, v4

    .line 79
    iget-wide v4, v7, LF0/m;->o:J

    .line 80
    .line 81
    cmp-long v4, v4, v13

    .line 82
    .line 83
    if-eqz v4, :cond_2

    .line 84
    .line 85
    iput-wide v13, v1, LF0/u;->a:J

    .line 86
    .line 87
    :goto_1
    move v2, v12

    .line 88
    goto/16 :goto_9

    .line 89
    .line 90
    :cond_2
    invoke-virtual {v8, v9}, Ld0/p;->E(I)V

    .line 91
    .line 92
    .line 93
    iput v2, v7, LF0/m;->q:I

    .line 94
    .line 95
    iget-object v1, v8, Ld0/p;->a:[B

    .line 96
    .line 97
    invoke-virtual {v7, v1, v2, v9, v2}, LF0/m;->t([BIIZ)Z

    .line 98
    .line 99
    .line 100
    iget v1, v8, Ld0/p;->b:I

    .line 101
    .line 102
    iget v4, v8, Ld0/p;->c:I

    .line 103
    .line 104
    add-int/lit16 v5, v4, -0xbc

    .line 105
    .line 106
    :goto_2
    if-lt v5, v1, :cond_7

    .line 107
    .line 108
    iget-object v7, v8, Ld0/p;->a:[B

    .line 109
    .line 110
    const/4 v9, -0x4

    .line 111
    move v10, v2

    .line 112
    :goto_3
    const/4 v13, 0x4

    .line 113
    if-gt v9, v13, :cond_6

    .line 114
    .line 115
    mul-int/lit16 v13, v9, 0xbc

    .line 116
    .line 117
    add-int/2addr v13, v5

    .line 118
    if-lt v13, v1, :cond_4

    .line 119
    .line 120
    if-ge v13, v4, :cond_4

    .line 121
    .line 122
    aget-byte v13, v7, v13

    .line 123
    .line 124
    if-eq v13, v11, :cond_3

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_3
    add-int/2addr v10, v12

    .line 128
    const/4 v13, 0x5

    .line 129
    if-ne v10, v13, :cond_5

    .line 130
    .line 131
    invoke-static {v8, v5, v3}, LZ1/f;->G(Ld0/p;II)J

    .line 132
    .line 133
    .line 134
    move-result-wide v9

    .line 135
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    cmp-long v7, v9, v13

    .line 141
    .line 142
    if-eqz v7, :cond_6

    .line 143
    .line 144
    move-wide v4, v9

    .line 145
    goto :goto_5

    .line 146
    :cond_4
    :goto_4
    move v10, v2

    .line 147
    :cond_5
    add-int/lit8 v9, v9, 0x1

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_6
    add-int/lit8 v5, v5, -0x1

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_7
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    :goto_5
    iput-wide v4, v6, Ll1/x;->h:J

    .line 159
    .line 160
    iput-boolean v12, v6, Ll1/x;->f:Z

    .line 161
    .line 162
    goto/16 :goto_9

    .line 163
    .line 164
    :cond_8
    iget-wide v4, v6, Ll1/x;->h:J

    .line 165
    .line 166
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    cmp-long v4, v4, v13

    .line 172
    .line 173
    if-nez v4, :cond_9

    .line 174
    .line 175
    move-object/from16 v1, p1

    .line 176
    .line 177
    check-cast v1, LF0/m;

    .line 178
    .line 179
    invoke-virtual {v6, v1}, Ll1/x;->a(LF0/m;)V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_9

    .line 183
    .line 184
    :cond_9
    iget-boolean v4, v6, Ll1/x;->e:Z

    .line 185
    .line 186
    if-nez v4, :cond_e

    .line 187
    .line 188
    int-to-long v4, v9

    .line 189
    move-object/from16 v7, p1

    .line 190
    .line 191
    check-cast v7, LF0/m;

    .line 192
    .line 193
    iget-wide v9, v7, LF0/m;->n:J

    .line 194
    .line 195
    invoke-static {v4, v5, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 196
    .line 197
    .line 198
    move-result-wide v4

    .line 199
    long-to-int v4, v4

    .line 200
    iget-wide v9, v7, LF0/m;->o:J

    .line 201
    .line 202
    int-to-long v13, v2

    .line 203
    cmp-long v5, v9, v13

    .line 204
    .line 205
    if-eqz v5, :cond_a

    .line 206
    .line 207
    iput-wide v13, v1, LF0/u;->a:J

    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_a
    invoke-virtual {v8, v4}, Ld0/p;->E(I)V

    .line 211
    .line 212
    .line 213
    iput v2, v7, LF0/m;->q:I

    .line 214
    .line 215
    iget-object v1, v8, Ld0/p;->a:[B

    .line 216
    .line 217
    invoke-virtual {v7, v1, v2, v4, v2}, LF0/m;->t([BIIZ)Z

    .line 218
    .line 219
    .line 220
    iget v1, v8, Ld0/p;->b:I

    .line 221
    .line 222
    iget v4, v8, Ld0/p;->c:I

    .line 223
    .line 224
    :goto_6
    if-ge v1, v4, :cond_d

    .line 225
    .line 226
    iget-object v5, v8, Ld0/p;->a:[B

    .line 227
    .line 228
    aget-byte v5, v5, v1

    .line 229
    .line 230
    if-eq v5, v11, :cond_b

    .line 231
    .line 232
    goto :goto_7

    .line 233
    :cond_b
    invoke-static {v8, v1, v3}, LZ1/f;->G(Ld0/p;II)J

    .line 234
    .line 235
    .line 236
    move-result-wide v9

    .line 237
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    cmp-long v5, v9, v13

    .line 243
    .line 244
    if-eqz v5, :cond_c

    .line 245
    .line 246
    move-wide v4, v9

    .line 247
    goto :goto_8

    .line 248
    :cond_c
    :goto_7
    add-int/lit8 v1, v1, 0x1

    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_d
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    :goto_8
    iput-wide v4, v6, Ll1/x;->g:J

    .line 257
    .line 258
    iput-boolean v12, v6, Ll1/x;->e:Z

    .line 259
    .line 260
    goto :goto_9

    .line 261
    :cond_e
    iget-wide v3, v6, Ll1/x;->g:J

    .line 262
    .line 263
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    cmp-long v1, v3, v7

    .line 269
    .line 270
    if-nez v1, :cond_f

    .line 271
    .line 272
    move-object/from16 v1, p1

    .line 273
    .line 274
    check-cast v1, LF0/m;

    .line 275
    .line 276
    invoke-virtual {v6, v1}, Ll1/x;->a(LF0/m;)V

    .line 277
    .line 278
    .line 279
    goto :goto_9

    .line 280
    :cond_f
    iget-object v1, v6, Ll1/x;->b:Ld0/u;

    .line 281
    .line 282
    invoke-virtual {v1, v3, v4}, Ld0/u;->b(J)J

    .line 283
    .line 284
    .line 285
    move-result-wide v3

    .line 286
    iget-wide v7, v6, Ll1/x;->h:J

    .line 287
    .line 288
    invoke-virtual {v1, v7, v8}, Ld0/u;->c(J)J

    .line 289
    .line 290
    .line 291
    move-result-wide v7

    .line 292
    sub-long/2addr v7, v3

    .line 293
    iput-wide v7, v6, Ll1/x;->i:J

    .line 294
    .line 295
    move-object/from16 v1, p1

    .line 296
    .line 297
    check-cast v1, LF0/m;

    .line 298
    .line 299
    invoke-virtual {v6, v1}, Ll1/x;->a(LF0/m;)V

    .line 300
    .line 301
    .line 302
    :goto_9
    return v2

    .line 303
    :cond_10
    iget-boolean v3, v0, Ll1/C;->p:Z

    .line 304
    .line 305
    if-nez v3, :cond_12

    .line 306
    .line 307
    iput-boolean v12, v0, Ll1/C;->p:Z

    .line 308
    .line 309
    iget-wide v7, v6, Ll1/x;->i:J

    .line 310
    .line 311
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    cmp-long v3, v7, v3

    .line 317
    .line 318
    if-eqz v3, :cond_11

    .line 319
    .line 320
    new-instance v9, LK0/b;

    .line 321
    .line 322
    iget v3, v0, Ll1/C;->t:I

    .line 323
    .line 324
    new-instance v4, LA0/b;

    .line 325
    .line 326
    const/16 v5, 0xd

    .line 327
    .line 328
    invoke-direct {v4, v5}, LA0/b;-><init>(I)V

    .line 329
    .line 330
    .line 331
    new-instance v5, LD0/d;

    .line 332
    .line 333
    iget-object v6, v6, Ll1/x;->b:Ld0/u;

    .line 334
    .line 335
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 336
    .line 337
    .line 338
    iput v3, v5, LD0/d;->l:I

    .line 339
    .line 340
    iput-object v6, v5, LD0/d;->m:Ljava/lang/Object;

    .line 341
    .line 342
    new-instance v3, Ld0/p;

    .line 343
    .line 344
    invoke-direct {v3}, Ld0/p;-><init>()V

    .line 345
    .line 346
    .line 347
    iput-object v3, v5, LD0/d;->n:Ljava/lang/Object;

    .line 348
    .line 349
    const-wide/16 v20, 0x1

    .line 350
    .line 351
    add-long v20, v7, v20

    .line 352
    .line 353
    const/16 v16, 0x3ac

    .line 354
    .line 355
    const-wide/16 v22, 0x0

    .line 356
    .line 357
    const-wide/16 v24, 0xbc

    .line 358
    .line 359
    move-object v3, v9

    .line 360
    move-wide v6, v7

    .line 361
    move-object v2, v9

    .line 362
    move-wide/from16 v8, v20

    .line 363
    .line 364
    move-wide/from16 v10, v22

    .line 365
    .line 366
    move/from16 v26, v13

    .line 367
    .line 368
    move-wide v12, v14

    .line 369
    move-wide/from16 v20, v14

    .line 370
    .line 371
    move-wide/from16 v14, v24

    .line 372
    .line 373
    invoke-direct/range {v3 .. v16}, LK0/b;-><init>(LF0/h;LF0/j;JJJJJI)V

    .line 374
    .line 375
    .line 376
    iput-object v2, v0, Ll1/C;->l:LK0/b;

    .line 377
    .line 378
    iget-object v3, v0, Ll1/C;->m:LF0/s;

    .line 379
    .line 380
    iget-object v2, v2, LK0/b;->a:LF0/f;

    .line 381
    .line 382
    invoke-interface {v3, v2}, LF0/s;->d(LF0/E;)V

    .line 383
    .line 384
    .line 385
    goto :goto_a

    .line 386
    :cond_11
    move/from16 v26, v13

    .line 387
    .line 388
    move-wide/from16 v20, v14

    .line 389
    .line 390
    iget-object v2, v0, Ll1/C;->m:LF0/s;

    .line 391
    .line 392
    new-instance v3, LF0/v;

    .line 393
    .line 394
    invoke-direct {v3, v7, v8}, LF0/v;-><init>(J)V

    .line 395
    .line 396
    .line 397
    invoke-interface {v2, v3}, LF0/s;->d(LF0/E;)V

    .line 398
    .line 399
    .line 400
    goto :goto_a

    .line 401
    :cond_12
    move/from16 v26, v13

    .line 402
    .line 403
    move-wide/from16 v20, v14

    .line 404
    .line 405
    :goto_a
    iget-boolean v2, v0, Ll1/C;->q:Z

    .line 406
    .line 407
    if-eqz v2, :cond_13

    .line 408
    .line 409
    const/4 v2, 0x0

    .line 410
    iput-boolean v2, v0, Ll1/C;->q:Z

    .line 411
    .line 412
    const-wide/16 v2, 0x0

    .line 413
    .line 414
    invoke-virtual {v0, v2, v3, v2, v3}, Ll1/C;->b(JJ)V

    .line 415
    .line 416
    .line 417
    move-object/from16 v4, p1

    .line 418
    .line 419
    check-cast v4, LF0/m;

    .line 420
    .line 421
    iget-wide v4, v4, LF0/m;->o:J

    .line 422
    .line 423
    cmp-long v4, v4, v2

    .line 424
    .line 425
    if-eqz v4, :cond_13

    .line 426
    .line 427
    iput-wide v2, v1, LF0/u;->a:J

    .line 428
    .line 429
    const/4 v2, 0x1

    .line 430
    return v2

    .line 431
    :cond_13
    const/4 v2, 0x1

    .line 432
    iget-object v3, v0, Ll1/C;->l:LK0/b;

    .line 433
    .line 434
    if-eqz v3, :cond_15

    .line 435
    .line 436
    iget-object v4, v3, LK0/b;->c:LF0/g;

    .line 437
    .line 438
    if-eqz v4, :cond_15

    .line 439
    .line 440
    move-object/from16 v2, p1

    .line 441
    .line 442
    check-cast v2, LF0/m;

    .line 443
    .line 444
    invoke-virtual {v3, v2, v1}, LK0/b;->b(LF0/m;LF0/u;)I

    .line 445
    .line 446
    .line 447
    move-result v1

    .line 448
    return v1

    .line 449
    :cond_14
    move v2, v12

    .line 450
    move/from16 v26, v13

    .line 451
    .line 452
    move-wide/from16 v20, v14

    .line 453
    .line 454
    :cond_15
    iget-object v1, v0, Ll1/C;->d:Ld0/p;

    .line 455
    .line 456
    iget-object v3, v1, Ld0/p;->a:[B

    .line 457
    .line 458
    iget v4, v1, Ld0/p;->b:I

    .line 459
    .line 460
    rsub-int v4, v4, 0x24b8

    .line 461
    .line 462
    const/16 v5, 0xbc

    .line 463
    .line 464
    if-ge v4, v5, :cond_17

    .line 465
    .line 466
    invoke-virtual {v1}, Ld0/p;->a()I

    .line 467
    .line 468
    .line 469
    move-result v4

    .line 470
    if-lez v4, :cond_16

    .line 471
    .line 472
    iget v6, v1, Ld0/p;->b:I

    .line 473
    .line 474
    const/4 v7, 0x0

    .line 475
    invoke-static {v3, v6, v3, v7, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 476
    .line 477
    .line 478
    :cond_16
    invoke-virtual {v1, v4, v3}, Ld0/p;->F(I[B)V

    .line 479
    .line 480
    .line 481
    :cond_17
    :goto_b
    invoke-virtual {v1}, Ld0/p;->a()I

    .line 482
    .line 483
    .line 484
    move-result v4

    .line 485
    iget-object v6, v0, Ll1/C;->h:Landroid/util/SparseArray;

    .line 486
    .line 487
    if-ge v4, v5, :cond_1c

    .line 488
    .line 489
    iget v4, v1, Ld0/p;->c:I

    .line 490
    .line 491
    rsub-int v7, v4, 0x24b8

    .line 492
    .line 493
    move-object/from16 v8, p1

    .line 494
    .line 495
    check-cast v8, LF0/m;

    .line 496
    .line 497
    invoke-virtual {v8, v3, v4, v7}, LF0/m;->read([BII)I

    .line 498
    .line 499
    .line 500
    move-result v7

    .line 501
    const/4 v8, -0x1

    .line 502
    if-ne v7, v8, :cond_1b

    .line 503
    .line 504
    const/4 v1, 0x0

    .line 505
    :goto_c
    invoke-virtual {v6}, Landroid/util/SparseArray;->size()I

    .line 506
    .line 507
    .line 508
    move-result v3

    .line 509
    if-ge v1, v3, :cond_1a

    .line 510
    .line 511
    invoke-virtual {v6, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v3

    .line 515
    check-cast v3, Ll1/F;

    .line 516
    .line 517
    instance-of v4, v3, Ll1/w;

    .line 518
    .line 519
    if-eqz v4, :cond_19

    .line 520
    .line 521
    check-cast v3, Ll1/w;

    .line 522
    .line 523
    iget v4, v3, Ll1/w;->c:I

    .line 524
    .line 525
    const/4 v5, 0x3

    .line 526
    if-ne v4, v5, :cond_19

    .line 527
    .line 528
    iget v4, v3, Ll1/w;->j:I

    .line 529
    .line 530
    if-ne v4, v8, :cond_19

    .line 531
    .line 532
    if-eqz v17, :cond_18

    .line 533
    .line 534
    iget-object v4, v3, Ll1/w;->a:Ll1/h;

    .line 535
    .line 536
    instance-of v4, v4, Ll1/j;

    .line 537
    .line 538
    if-nez v4, :cond_19

    .line 539
    .line 540
    :cond_18
    new-instance v4, Ld0/p;

    .line 541
    .line 542
    invoke-direct {v4}, Ld0/p;-><init>()V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v3, v2, v4}, Ll1/w;->b(ILd0/p;)V

    .line 546
    .line 547
    .line 548
    :cond_19
    add-int/lit8 v1, v1, 0x1

    .line 549
    .line 550
    goto :goto_c

    .line 551
    :cond_1a
    return v8

    .line 552
    :cond_1b
    add-int/2addr v4, v7

    .line 553
    invoke-virtual {v1, v4}, Ld0/p;->G(I)V

    .line 554
    .line 555
    .line 556
    goto :goto_b

    .line 557
    :cond_1c
    iget v3, v1, Ld0/p;->b:I

    .line 558
    .line 559
    iget v4, v1, Ld0/p;->c:I

    .line 560
    .line 561
    iget-object v5, v1, Ld0/p;->a:[B

    .line 562
    .line 563
    move v7, v3

    .line 564
    :goto_d
    if-ge v7, v4, :cond_1d

    .line 565
    .line 566
    aget-byte v8, v5, v7

    .line 567
    .line 568
    const/16 v9, 0x47

    .line 569
    .line 570
    if-eq v8, v9, :cond_1d

    .line 571
    .line 572
    add-int/lit8 v7, v7, 0x1

    .line 573
    .line 574
    goto :goto_d

    .line 575
    :cond_1d
    invoke-virtual {v1, v7}, Ld0/p;->H(I)V

    .line 576
    .line 577
    .line 578
    add-int/lit16 v5, v7, 0xbc

    .line 579
    .line 580
    const/4 v8, 0x0

    .line 581
    if-le v5, v4, :cond_20

    .line 582
    .line 583
    iget v4, v0, Ll1/C;->s:I

    .line 584
    .line 585
    sub-int/2addr v7, v3

    .line 586
    add-int/2addr v7, v4

    .line 587
    iput v7, v0, Ll1/C;->s:I

    .line 588
    .line 589
    move/from16 v3, v26

    .line 590
    .line 591
    const/4 v4, 0x2

    .line 592
    if-ne v3, v4, :cond_1e

    .line 593
    .line 594
    const/16 v9, 0x178

    .line 595
    .line 596
    if-gt v7, v9, :cond_1f

    .line 597
    .line 598
    :cond_1e
    const/4 v7, 0x0

    .line 599
    goto :goto_e

    .line 600
    :cond_1f
    const-string v1, "Cannot find sync byte. Most likely not a Transport Stream."

    .line 601
    .line 602
    invoke-static {v8, v1}, La0/H;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)La0/H;

    .line 603
    .line 604
    .line 605
    move-result-object v1

    .line 606
    throw v1

    .line 607
    :cond_20
    move/from16 v3, v26

    .line 608
    .line 609
    const/4 v4, 0x2

    .line 610
    const/4 v7, 0x0

    .line 611
    iput v7, v0, Ll1/C;->s:I

    .line 612
    .line 613
    :goto_e
    iget v9, v1, Ld0/p;->c:I

    .line 614
    .line 615
    if-le v5, v9, :cond_21

    .line 616
    .line 617
    return v7

    .line 618
    :cond_21
    invoke-virtual {v1}, Ld0/p;->i()I

    .line 619
    .line 620
    .line 621
    move-result v10

    .line 622
    const/high16 v11, 0x800000

    .line 623
    .line 624
    and-int/2addr v11, v10

    .line 625
    if-eqz v11, :cond_22

    .line 626
    .line 627
    invoke-virtual {v1, v5}, Ld0/p;->H(I)V

    .line 628
    .line 629
    .line 630
    return v7

    .line 631
    :cond_22
    const/high16 v7, 0x400000

    .line 632
    .line 633
    and-int/2addr v7, v10

    .line 634
    if-eqz v7, :cond_23

    .line 635
    .line 636
    move v12, v2

    .line 637
    goto :goto_f

    .line 638
    :cond_23
    const/4 v12, 0x0

    .line 639
    :goto_f
    const v7, 0x1fff00

    .line 640
    .line 641
    .line 642
    and-int/2addr v7, v10

    .line 643
    shr-int/lit8 v7, v7, 0x8

    .line 644
    .line 645
    and-int/lit8 v11, v10, 0x20

    .line 646
    .line 647
    if-eqz v11, :cond_24

    .line 648
    .line 649
    move v11, v2

    .line 650
    goto :goto_10

    .line 651
    :cond_24
    const/4 v11, 0x0

    .line 652
    :goto_10
    and-int/lit8 v13, v10, 0x10

    .line 653
    .line 654
    if-eqz v13, :cond_25

    .line 655
    .line 656
    invoke-virtual {v6, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v6

    .line 660
    move-object v8, v6

    .line 661
    check-cast v8, Ll1/F;

    .line 662
    .line 663
    :cond_25
    if-nez v8, :cond_26

    .line 664
    .line 665
    invoke-virtual {v1, v5}, Ld0/p;->H(I)V

    .line 666
    .line 667
    .line 668
    const/4 v6, 0x0

    .line 669
    return v6

    .line 670
    :cond_26
    const/4 v6, 0x0

    .line 671
    if-eq v3, v4, :cond_28

    .line 672
    .line 673
    and-int/lit8 v10, v10, 0xf

    .line 674
    .line 675
    iget-object v13, v0, Ll1/C;->e:Landroid/util/SparseIntArray;

    .line 676
    .line 677
    add-int/lit8 v14, v10, -0x1

    .line 678
    .line 679
    invoke-virtual {v13, v7, v14}, Landroid/util/SparseIntArray;->get(II)I

    .line 680
    .line 681
    .line 682
    move-result v14

    .line 683
    invoke-virtual {v13, v7, v10}, Landroid/util/SparseIntArray;->put(II)V

    .line 684
    .line 685
    .line 686
    if-ne v14, v10, :cond_27

    .line 687
    .line 688
    invoke-virtual {v1, v5}, Ld0/p;->H(I)V

    .line 689
    .line 690
    .line 691
    return v6

    .line 692
    :cond_27
    add-int/2addr v14, v2

    .line 693
    and-int/lit8 v6, v14, 0xf

    .line 694
    .line 695
    if-eq v10, v6, :cond_28

    .line 696
    .line 697
    invoke-interface {v8}, Ll1/F;->a()V

    .line 698
    .line 699
    .line 700
    :cond_28
    if-eqz v11, :cond_2a

    .line 701
    .line 702
    invoke-virtual {v1}, Ld0/p;->v()I

    .line 703
    .line 704
    .line 705
    move-result v6

    .line 706
    invoke-virtual {v1}, Ld0/p;->v()I

    .line 707
    .line 708
    .line 709
    move-result v10

    .line 710
    and-int/lit8 v10, v10, 0x40

    .line 711
    .line 712
    if-eqz v10, :cond_29

    .line 713
    .line 714
    move v10, v4

    .line 715
    goto :goto_11

    .line 716
    :cond_29
    const/4 v10, 0x0

    .line 717
    :goto_11
    or-int/2addr v12, v10

    .line 718
    sub-int/2addr v6, v2

    .line 719
    invoke-virtual {v1, v6}, Ld0/p;->I(I)V

    .line 720
    .line 721
    .line 722
    :cond_2a
    iget-boolean v6, v0, Ll1/C;->o:Z

    .line 723
    .line 724
    if-eq v3, v4, :cond_2b

    .line 725
    .line 726
    if-nez v6, :cond_2b

    .line 727
    .line 728
    iget-object v10, v0, Ll1/C;->j:Landroid/util/SparseBooleanArray;

    .line 729
    .line 730
    const/4 v11, 0x0

    .line 731
    invoke-virtual {v10, v7, v11}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    .line 732
    .line 733
    .line 734
    move-result v7

    .line 735
    if-nez v7, :cond_2c

    .line 736
    .line 737
    :cond_2b
    invoke-virtual {v1, v5}, Ld0/p;->G(I)V

    .line 738
    .line 739
    .line 740
    invoke-interface {v8, v12, v1}, Ll1/F;->b(ILd0/p;)V

    .line 741
    .line 742
    .line 743
    invoke-virtual {v1, v9}, Ld0/p;->G(I)V

    .line 744
    .line 745
    .line 746
    :cond_2c
    if-eq v3, v4, :cond_2d

    .line 747
    .line 748
    if-nez v6, :cond_2d

    .line 749
    .line 750
    iget-boolean v3, v0, Ll1/C;->o:Z

    .line 751
    .line 752
    if-eqz v3, :cond_2d

    .line 753
    .line 754
    cmp-long v3, v20, v18

    .line 755
    .line 756
    if-eqz v3, :cond_2d

    .line 757
    .line 758
    iput-boolean v2, v0, Ll1/C;->q:Z

    .line 759
    .line 760
    :cond_2d
    invoke-virtual {v1, v5}, Ld0/p;->H(I)V

    .line 761
    .line 762
    .line 763
    const/4 v1, 0x0

    .line 764
    return v1
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
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
.end method

.method public final e(LF0/r;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Ll1/C;->d:Ld0/p;

    .line 2
    .line 3
    iget-object v0, v0, Ld0/p;->a:[B

    .line 4
    .line 5
    check-cast p1, LF0/m;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/16 v2, 0x3ac

    .line 9
    .line 10
    invoke-virtual {p1, v0, v1, v2, v1}, LF0/m;->t([BIIZ)Z

    .line 11
    .line 12
    .line 13
    move v2, v1

    .line 14
    :goto_0
    const/16 v3, 0xbc

    .line 15
    .line 16
    if-ge v2, v3, :cond_2

    .line 17
    .line 18
    move v3, v1

    .line 19
    :goto_1
    const/4 v4, 0x5

    .line 20
    if-ge v3, v4, :cond_1

    .line 21
    .line 22
    mul-int/lit16 v4, v3, 0xbc

    .line 23
    .line 24
    add-int/2addr v4, v2

    .line 25
    aget-byte v4, v0, v4

    .line 26
    .line 27
    const/16 v5, 0x47

    .line 28
    .line 29
    if-eq v4, v5, :cond_0

    .line 30
    .line 31
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {p1, v2}, LF0/m;->f(I)V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    return p1

    .line 42
    :cond_2
    return v1
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

.method public final j(LF0/s;)V
    .locals 2

    .line 1
    iget v0, p0, Ll1/C;->b:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LZ1/s;

    .line 8
    .line 9
    iget-object v1, p0, Ll1/C;->g:Lc1/j;

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, LZ1/s;-><init>(LF0/s;Lc1/j;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v0

    .line 15
    :cond_0
    iput-object p1, p0, Ll1/C;->m:LF0/s;

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
.end method

.method public final release()V
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
.end method
