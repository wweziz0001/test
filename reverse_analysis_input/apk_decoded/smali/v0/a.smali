.class public final Lv0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly0/i;


# instance fields
.field public final a:LB0/s;

.field public final b:I

.field public final c:[Ly0/f;

.field public final d:Lf0/h;

.field public e:LA0/w;

.field public f:Lw0/c;

.field public g:I

.field public h:Lx0/b;


# direct methods
.method public constructor <init>(LB0/s;Lw0/c;ILA0/w;Lf0/h;La0/z;Z)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    move-object/from16 v4, p1

    .line 13
    .line 14
    iput-object v4, v0, Lv0/a;->a:LB0/s;

    .line 15
    .line 16
    iput-object v1, v0, Lv0/a;->f:Lw0/c;

    .line 17
    .line 18
    iput v2, v0, Lv0/a;->b:I

    .line 19
    .line 20
    iput-object v3, v0, Lv0/a;->e:LA0/w;

    .line 21
    .line 22
    move-object/from16 v4, p5

    .line 23
    .line 24
    iput-object v4, v0, Lv0/a;->d:Lf0/h;

    .line 25
    .line 26
    iget-object v4, v1, Lw0/c;->f:[Lw0/b;

    .line 27
    .line 28
    aget-object v2, v4, v2

    .line 29
    .line 30
    invoke-interface/range {p4 .. p4}, LA0/w;->length()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    new-array v4, v4, [Ly0/f;

    .line 35
    .line 36
    iput-object v4, v0, Lv0/a;->c:[Ly0/f;

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    move v5, v4

    .line 40
    :goto_0
    iget-object v6, v0, Lv0/a;->c:[Ly0/f;

    .line 41
    .line 42
    array-length v6, v6

    .line 43
    if-ge v5, v6, :cond_3

    .line 44
    .line 45
    invoke-interface {v3, v5}, LA0/w;->k(I)I

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    iget-object v6, v2, Lw0/b;->j:[La0/p;

    .line 50
    .line 51
    aget-object v6, v6, v8

    .line 52
    .line 53
    iget-object v7, v6, La0/p;->r:La0/l;

    .line 54
    .line 55
    if-eqz v7, :cond_0

    .line 56
    .line 57
    iget-object v7, v1, Lw0/c;->e:Lw0/a;

    .line 58
    .line 59
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v7, v7, Lw0/a;->c:[LZ0/u;

    .line 63
    .line 64
    :goto_1
    move-object/from16 v20, v7

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_0
    const/4 v7, 0x0

    .line 68
    goto :goto_1

    .line 69
    :goto_2
    const/4 v7, 0x2

    .line 70
    iget v9, v2, Lw0/b;->a:I

    .line 71
    .line 72
    if-ne v9, v7, :cond_1

    .line 73
    .line 74
    const/4 v7, 0x4

    .line 75
    move/from16 v21, v7

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_1
    move/from16 v21, v4

    .line 79
    .line 80
    :goto_3
    new-instance v24, LZ0/t;

    .line 81
    .line 82
    move-object/from16 v7, v24

    .line 83
    .line 84
    iget-wide v10, v1, Lw0/c;->g:J

    .line 85
    .line 86
    move-wide v14, v10

    .line 87
    move-wide/from16 v16, v10

    .line 88
    .line 89
    const/16 v19, 0x0

    .line 90
    .line 91
    iget-wide v10, v2, Lw0/b;->c:J

    .line 92
    .line 93
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    const/16 v22, 0x0

    .line 99
    .line 100
    const/16 v23, 0x0

    .line 101
    .line 102
    move-object/from16 v18, v6

    .line 103
    .line 104
    invoke-direct/range {v7 .. v23}, LZ0/t;-><init>(IIJJJJLa0/p;I[LZ0/u;I[J[J)V

    .line 105
    .line 106
    .line 107
    if-nez p7, :cond_2

    .line 108
    .line 109
    const/16 v7, 0x23

    .line 110
    .line 111
    :goto_4
    move v12, v7

    .line 112
    goto :goto_5

    .line 113
    :cond_2
    const/4 v7, 0x3

    .line 114
    goto :goto_4

    .line 115
    :goto_5
    new-instance v7, LZ0/m;

    .line 116
    .line 117
    sget-object v15, Lm2/b0;->p:Lm2/b0;

    .line 118
    .line 119
    const/16 v16, 0x0

    .line 120
    .line 121
    const/4 v13, 0x0

    .line 122
    move-object v10, v7

    .line 123
    move-object/from16 v11, p6

    .line 124
    .line 125
    move-object/from16 v14, v24

    .line 126
    .line 127
    invoke-direct/range {v10 .. v16}, LZ0/m;-><init>(Lc1/j;ILd0/u;LZ0/t;Ljava/util/List;Lk0/n;)V

    .line 128
    .line 129
    .line 130
    iget-object v8, v0, Lv0/a;->c:[Ly0/f;

    .line 131
    .line 132
    new-instance v9, Ly0/d;

    .line 133
    .line 134
    iget v10, v2, Lw0/b;->a:I

    .line 135
    .line 136
    invoke-direct {v9, v7, v10, v6}, Ly0/d;-><init>(LF0/q;ILa0/p;)V

    .line 137
    .line 138
    .line 139
    aput-object v9, v8, v5

    .line 140
    .line 141
    add-int/lit8 v5, v5, 0x1

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_3
    return-void
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
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/a;->h:Lx0/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lv0/a;->a:LB0/s;

    .line 6
    .line 7
    invoke-interface {v0}, LB0/s;->a()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    throw v0
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

.method public final b(JLh0/t0;)J
    .locals 11

    .line 1
    iget-object v0, p0, Lv0/a;->f:Lw0/c;

    .line 2
    .line 3
    iget-object v0, v0, Lw0/c;->f:[Lw0/b;

    .line 4
    .line 5
    iget v1, p0, Lv0/a;->b:I

    .line 6
    .line 7
    aget-object v0, v0, v1

    .line 8
    .line 9
    iget-object v1, v0, Lw0/b;->o:[J

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-static {v1, p1, p2, v2}, Ld0/w;->e([JJZ)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v3, v0, Lw0/b;->o:[J

    .line 17
    .line 18
    aget-wide v7, v3, v1

    .line 19
    .line 20
    cmp-long v4, v7, p1

    .line 21
    .line 22
    if-gez v4, :cond_0

    .line 23
    .line 24
    iget v0, v0, Lw0/b;->k:I

    .line 25
    .line 26
    sub-int/2addr v0, v2

    .line 27
    if-ge v1, v0, :cond_0

    .line 28
    .line 29
    add-int/2addr v1, v2

    .line 30
    aget-wide v0, v3, v1

    .line 31
    .line 32
    move-wide v9, v0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-wide v9, v7

    .line 35
    :goto_0
    move-object v4, p3

    .line 36
    move-wide v5, p1

    .line 37
    invoke-virtual/range {v4 .. v10}, Lh0/t0;->a(JJJ)J

    .line 38
    .line 39
    .line 40
    move-result-wide p1

    .line 41
    return-wide p1
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

.method public final c(JLy0/e;Ljava/util/List;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/a;->h:Lx0/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    iget-object v0, p0, Lv0/a;->e:LA0/w;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2, p3, p4}, LA0/w;->i(JLy0/e;Ljava/util/List;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
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

.method public final d(Ly0/e;ZLA/j;LA0/b;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/a;->e:LA0/w;

    .line 2
    .line 3
    invoke-static {v0}, LD1/b;->r(LA0/w;)LB0/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p3}, LA0/b;->m(LB0/j;LA/j;)LB0/k;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    iget p2, p3, LB0/k;->a:I

    .line 19
    .line 20
    const/4 p4, 0x2

    .line 21
    if-ne p2, p4, :cond_0

    .line 22
    .line 23
    iget-object p2, p0, Lv0/a;->e:LA0/w;

    .line 24
    .line 25
    iget-object p1, p1, Ly0/e;->o:La0/p;

    .line 26
    .line 27
    invoke-interface {p2, p1}, LA0/w;->p(La0/p;)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget-wide p3, p3, LB0/k;->b:J

    .line 32
    .line 33
    invoke-interface {p2, p3, p4, p1}, LA0/w;->q(JI)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 p1, 0x0

    .line 42
    :goto_0
    return p1
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
.end method

.method public final e(Lh0/T;JLjava/util/List;La0/m;)V
    .locals 43

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v3, p5

    .line 6
    .line 7
    iget-object v4, v0, Lv0/a;->h:Lx0/b;

    .line 8
    .line 9
    if-eqz v4, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v4, v0, Lv0/a;->f:Lw0/c;

    .line 13
    .line 14
    iget-object v5, v4, Lw0/c;->f:[Lw0/b;

    .line 15
    .line 16
    iget v6, v0, Lv0/a;->b:I

    .line 17
    .line 18
    aget-object v5, v5, v6

    .line 19
    .line 20
    iget v7, v5, Lw0/b;->k:I

    .line 21
    .line 22
    const/4 v8, 0x1

    .line 23
    if-nez v7, :cond_1

    .line 24
    .line 25
    iget-boolean v1, v4, Lw0/c;->d:Z

    .line 26
    .line 27
    xor-int/2addr v1, v8

    .line 28
    iput-boolean v1, v3, La0/m;->a:Z

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    iget-object v7, v5, Lw0/b;->o:[J

    .line 36
    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    invoke-static {v7, v1, v2, v8}, Ld0/w;->e([JJZ)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    move-object/from16 v14, p4

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->size()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    sub-int/2addr v4, v8

    .line 51
    move-object/from16 v14, p4

    .line 52
    .line 53
    invoke-interface {v14, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    check-cast v4, Ly0/l;

    .line 58
    .line 59
    invoke-virtual {v4}, Ly0/l;->a()J

    .line 60
    .line 61
    .line 62
    move-result-wide v9

    .line 63
    iget v4, v0, Lv0/a;->g:I

    .line 64
    .line 65
    int-to-long v11, v4

    .line 66
    sub-long/2addr v9, v11

    .line 67
    long-to-int v4, v9

    .line 68
    if-gez v4, :cond_3

    .line 69
    .line 70
    new-instance v1, Lx0/b;

    .line 71
    .line 72
    invoke-direct {v1}, Ljava/io/IOException;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object v1, v0, Lv0/a;->h:Lx0/b;

    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    :goto_0
    iget v9, v5, Lw0/b;->k:I

    .line 79
    .line 80
    if-lt v4, v9, :cond_4

    .line 81
    .line 82
    iget-object v1, v0, Lv0/a;->f:Lw0/c;

    .line 83
    .line 84
    iget-boolean v1, v1, Lw0/c;->d:Z

    .line 85
    .line 86
    xor-int/2addr v1, v8

    .line 87
    iput-boolean v1, v3, La0/m;->a:Z

    .line 88
    .line 89
    return-void

    .line 90
    :cond_4
    move-object/from16 v9, p1

    .line 91
    .line 92
    iget-wide v10, v9, Lh0/T;->a:J

    .line 93
    .line 94
    sub-long v12, v1, v10

    .line 95
    .line 96
    iget-object v9, v0, Lv0/a;->f:Lw0/c;

    .line 97
    .line 98
    iget-boolean v15, v9, Lw0/c;->d:Z

    .line 99
    .line 100
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    if-nez v15, :cond_5

    .line 106
    .line 107
    move-wide/from16 v20, v18

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_5
    iget-object v9, v9, Lw0/c;->f:[Lw0/b;

    .line 111
    .line 112
    aget-object v6, v9, v6

    .line 113
    .line 114
    iget v9, v6, Lw0/b;->k:I

    .line 115
    .line 116
    sub-int/2addr v9, v8

    .line 117
    iget-object v15, v6, Lw0/b;->o:[J

    .line 118
    .line 119
    aget-wide v16, v15, v9

    .line 120
    .line 121
    invoke-virtual {v6, v9}, Lw0/b;->b(I)J

    .line 122
    .line 123
    .line 124
    move-result-wide v20

    .line 125
    add-long v20, v20, v16

    .line 126
    .line 127
    sub-long v20, v20, v10

    .line 128
    .line 129
    :goto_1
    iget-object v6, v0, Lv0/a;->e:LA0/w;

    .line 130
    .line 131
    invoke-interface {v6}, LA0/w;->length()I

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    new-array v15, v6, [Ly0/m;

    .line 136
    .line 137
    const/16 v22, 0x0

    .line 138
    .line 139
    move/from16 v9, v22

    .line 140
    .line 141
    :goto_2
    if-ge v9, v6, :cond_6

    .line 142
    .line 143
    iget-object v8, v0, Lv0/a;->e:LA0/w;

    .line 144
    .line 145
    invoke-interface {v8, v9}, LA0/w;->k(I)I

    .line 146
    .line 147
    .line 148
    new-instance v8, Lk0/j;

    .line 149
    .line 150
    invoke-direct {v8, v5, v4}, Lk0/j;-><init>(Lw0/b;I)V

    .line 151
    .line 152
    .line 153
    aput-object v8, v15, v9

    .line 154
    .line 155
    add-int/lit8 v9, v9, 0x1

    .line 156
    .line 157
    const/4 v8, 0x1

    .line 158
    goto :goto_2

    .line 159
    :cond_6
    iget-object v9, v0, Lv0/a;->e:LA0/w;

    .line 160
    .line 161
    move-object v6, v15

    .line 162
    move-wide/from16 v14, v20

    .line 163
    .line 164
    move-object/from16 v16, p4

    .line 165
    .line 166
    move-object/from16 v17, v6

    .line 167
    .line 168
    invoke-interface/range {v9 .. v17}, LA0/w;->s(JJJLjava/util/List;[Ly0/m;)V

    .line 169
    .line 170
    .line 171
    aget-wide v40, v7, v4

    .line 172
    .line 173
    invoke-virtual {v5, v4}, Lw0/b;->b(I)J

    .line 174
    .line 175
    .line 176
    move-result-wide v6

    .line 177
    add-long v31, v6, v40

    .line 178
    .line 179
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->isEmpty()Z

    .line 180
    .line 181
    .line 182
    move-result v6

    .line 183
    if-eqz v6, :cond_7

    .line 184
    .line 185
    move-wide/from16 v33, v1

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_7
    move-wide/from16 v33, v18

    .line 189
    .line 190
    :goto_3
    iget v1, v0, Lv0/a;->g:I

    .line 191
    .line 192
    add-int/2addr v1, v4

    .line 193
    iget-object v2, v0, Lv0/a;->e:LA0/w;

    .line 194
    .line 195
    invoke-interface {v2}, LA0/w;->f()I

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    iget-object v6, v0, Lv0/a;->c:[Ly0/f;

    .line 200
    .line 201
    aget-object v42, v6, v2

    .line 202
    .line 203
    iget-object v6, v0, Lv0/a;->e:LA0/w;

    .line 204
    .line 205
    invoke-interface {v6, v2}, LA0/w;->k(I)I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    iget-object v6, v5, Lw0/b;->j:[La0/p;

    .line 210
    .line 211
    if-eqz v6, :cond_8

    .line 212
    .line 213
    const/4 v7, 0x1

    .line 214
    goto :goto_4

    .line 215
    :cond_8
    move/from16 v7, v22

    .line 216
    .line 217
    :goto_4
    invoke-static {v7}, Ld0/m;->h(Z)V

    .line 218
    .line 219
    .line 220
    iget-object v7, v5, Lw0/b;->n:Ljava/util/ArrayList;

    .line 221
    .line 222
    if-eqz v7, :cond_9

    .line 223
    .line 224
    const/4 v8, 0x1

    .line 225
    goto :goto_5

    .line 226
    :cond_9
    move/from16 v8, v22

    .line 227
    .line 228
    :goto_5
    invoke-static {v8}, Ld0/m;->h(Z)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 232
    .line 233
    .line 234
    move-result v8

    .line 235
    if-ge v4, v8, :cond_a

    .line 236
    .line 237
    const/4 v8, 0x1

    .line 238
    goto :goto_6

    .line 239
    :cond_a
    move/from16 v8, v22

    .line 240
    .line 241
    :goto_6
    invoke-static {v8}, Ld0/m;->h(Z)V

    .line 242
    .line 243
    .line 244
    aget-object v2, v6, v2

    .line 245
    .line 246
    iget v2, v2, La0/p;->j:I

    .line 247
    .line 248
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    check-cast v4, Ljava/lang/Long;

    .line 257
    .line 258
    invoke-virtual {v4}, Ljava/lang/Long;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    iget-object v6, v5, Lw0/b;->m:Ljava/lang/String;

    .line 263
    .line 264
    const-string v7, "{bitrate}"

    .line 265
    .line 266
    invoke-virtual {v6, v7, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    const-string v7, "{Bitrate}"

    .line 271
    .line 272
    invoke-virtual {v6, v7, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    const-string v6, "{start time}"

    .line 277
    .line 278
    invoke-virtual {v2, v6, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    const-string v6, "{start_time}"

    .line 283
    .line 284
    invoke-virtual {v2, v6, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    iget-object v4, v5, Lw0/b;->l:Ljava/lang/String;

    .line 289
    .line 290
    invoke-static {v4, v2}, Ld0/m;->w(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 291
    .line 292
    .line 293
    move-result-object v6

    .line 294
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 295
    .line 296
    .line 297
    iget-object v2, v0, Lv0/a;->e:LA0/w;

    .line 298
    .line 299
    invoke-interface {v2}, LA0/w;->d()La0/p;

    .line 300
    .line 301
    .line 302
    move-result-object v26

    .line 303
    iget-object v2, v0, Lv0/a;->e:LA0/w;

    .line 304
    .line 305
    invoke-interface {v2}, LA0/w;->e()I

    .line 306
    .line 307
    .line 308
    move-result v27

    .line 309
    iget-object v2, v0, Lv0/a;->e:LA0/w;

    .line 310
    .line 311
    invoke-interface {v2}, LA0/w;->l()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v28

    .line 315
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 316
    .line 317
    .line 318
    move-result-object v9

    .line 319
    const-string v2, "The uri must be set."

    .line 320
    .line 321
    invoke-static {v6, v2}, Ld0/m;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    new-instance v25, Lf0/l;

    .line 325
    .line 326
    const-wide/16 v12, -0x1

    .line 327
    .line 328
    const/4 v14, 0x0

    .line 329
    const/4 v7, 0x1

    .line 330
    const/4 v8, 0x0

    .line 331
    const-wide/16 v10, 0x0

    .line 332
    .line 333
    const/4 v15, 0x0

    .line 334
    move-object/from16 v5, v25

    .line 335
    .line 336
    invoke-direct/range {v5 .. v15}, Lf0/l;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 337
    .line 338
    .line 339
    new-instance v2, Ly0/j;

    .line 340
    .line 341
    move-object/from16 v23, v2

    .line 342
    .line 343
    int-to-long v4, v1

    .line 344
    move-wide/from16 v37, v4

    .line 345
    .line 346
    const-wide v35, -0x7fffffffffffffffL    # -4.9E-324

    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    iget-object v1, v0, Lv0/a;->d:Lf0/h;

    .line 352
    .line 353
    move-object/from16 v24, v1

    .line 354
    .line 355
    const/16 v39, 0x1

    .line 356
    .line 357
    move-wide/from16 v29, v40

    .line 358
    .line 359
    invoke-direct/range {v23 .. v42}, Ly0/j;-><init>(Lf0/h;Lf0/l;La0/p;ILjava/lang/Object;JJJJJIJLy0/f;)V

    .line 360
    .line 361
    .line 362
    iput-object v2, v3, La0/m;->b:Ljava/lang/Object;

    .line 363
    .line 364
    return-void
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
.end method

.method public final f(JLjava/util/List;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lv0/a;->h:Lx0/b;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lv0/a;->e:LA0/w;

    .line 6
    .line 7
    invoke-interface {v0}, LA0/w;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-ge v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lv0/a;->e:LA0/w;

    .line 16
    .line 17
    invoke-interface {v0, p1, p2, p3}, LA0/w;->n(JLjava/util/List;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1
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

.method public final g(Ly0/e;)V
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

.method public final release()V
    .locals 4

    .line 1
    iget-object v0, p0, Lv0/a;->c:[Ly0/f;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    check-cast v3, Ly0/d;

    .line 10
    .line 11
    iget-object v3, v3, Ly0/d;->l:LF0/q;

    .line 12
    .line 13
    invoke-interface {v3}, LF0/q;->release()V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
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
.end method
