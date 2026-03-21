.class public final Lh0/V;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:[Lx0/f0;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Lh0/W;

.field public h:Z

.field public final i:[Z

.field public final j:[Lh0/q0;

.field public final k:LA0/z;

.field public final l:Lh0/g0;

.field public m:Lh0/V;

.field public n:Lx0/q0;

.field public o:LA0/A;

.field public p:J


# direct methods
.method public constructor <init>([Lh0/q0;JLA0/z;LB0/f;Lh0/g0;Lh0/W;LA0/A;)V
    .locals 9

    .line 1
    move-object v0, p0

    .line 2
    move-object v1, p1

    .line 3
    move-object v2, p6

    .line 4
    move-object/from16 v3, p7

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v1, v0, Lh0/V;->j:[Lh0/q0;

    .line 10
    .line 11
    move-wide v4, p2

    .line 12
    iput-wide v4, v0, Lh0/V;->p:J

    .line 13
    .line 14
    move-object v4, p4

    .line 15
    iput-object v4, v0, Lh0/V;->k:LA0/z;

    .line 16
    .line 17
    iput-object v2, v0, Lh0/V;->l:Lh0/g0;

    .line 18
    .line 19
    iget-object v4, v3, Lh0/W;->a:Lx0/H;

    .line 20
    .line 21
    iget-object v5, v4, Lx0/H;->a:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object v5, v0, Lh0/V;->b:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object v3, v0, Lh0/V;->g:Lh0/W;

    .line 26
    .line 27
    sget-object v5, Lx0/q0;->d:Lx0/q0;

    .line 28
    .line 29
    iput-object v5, v0, Lh0/V;->n:Lx0/q0;

    .line 30
    .line 31
    move-object/from16 v5, p8

    .line 32
    .line 33
    iput-object v5, v0, Lh0/V;->o:LA0/A;

    .line 34
    .line 35
    array-length v5, v1

    .line 36
    new-array v5, v5, [Lx0/f0;

    .line 37
    .line 38
    iput-object v5, v0, Lh0/V;->c:[Lx0/f0;

    .line 39
    .line 40
    array-length v1, v1

    .line 41
    new-array v1, v1, [Z

    .line 42
    .line 43
    iput-object v1, v0, Lh0/V;->i:[Z

    .line 44
    .line 45
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    sget v1, Lh0/a;->d:I

    .line 49
    .line 50
    iget-object v1, v4, Lx0/H;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Landroid/util/Pair;

    .line 53
    .line 54
    iget-object v5, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 55
    .line 56
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 57
    .line 58
    invoke-virtual {v4, v1}, Lx0/H;->a(Ljava/lang/Object;)Lx0/H;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    iget-object v4, v2, Lh0/g0;->d:Ljava/util/HashMap;

    .line 63
    .line 64
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    check-cast v4, Lh0/f0;

    .line 69
    .line 70
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget-object v5, v2, Lh0/g0;->g:Ljava/util/HashSet;

    .line 74
    .line 75
    invoke-virtual {v5, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    iget-object v5, v2, Lh0/g0;->f:Ljava/util/HashMap;

    .line 79
    .line 80
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    check-cast v5, Lh0/e0;

    .line 85
    .line 86
    if-eqz v5, :cond_0

    .line 87
    .line 88
    iget-object v6, v5, Lh0/e0;->a:Lx0/J;

    .line 89
    .line 90
    check-cast v6, Lx0/a;

    .line 91
    .line 92
    iget-object v5, v5, Lh0/e0;->b:Lh0/Z;

    .line 93
    .line 94
    invoke-virtual {v6, v5}, Lx0/a;->l(Lx0/I;)V

    .line 95
    .line 96
    .line 97
    :cond_0
    iget-object v5, v4, Lh0/f0;->c:Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    iget-object v5, v4, Lh0/f0;->a:Lx0/D;

    .line 103
    .line 104
    iget-wide v6, v3, Lh0/W;->b:J

    .line 105
    .line 106
    move-object v8, p5

    .line 107
    invoke-virtual {v5, v1, p5, v6, v7}, Lx0/D;->E(Lx0/H;LB0/f;J)Lx0/A;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iget-object v5, v2, Lh0/g0;->c:Ljava/util/IdentityHashMap;

    .line 112
    .line 113
    invoke-virtual {v5, v1, v4}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p6}, Lh0/g0;->c()V

    .line 117
    .line 118
    .line 119
    iget-wide v2, v3, Lh0/W;->d:J

    .line 120
    .line 121
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    cmp-long v4, v2, v4

    .line 127
    .line 128
    if-eqz v4, :cond_1

    .line 129
    .line 130
    new-instance v4, Lx0/d;

    .line 131
    .line 132
    const/4 v5, 0x1

    .line 133
    const-wide/16 v6, 0x0

    .line 134
    .line 135
    move-object p1, v4

    .line 136
    move-object p2, v1

    .line 137
    move p3, v5

    .line 138
    move-wide p4, v6

    .line 139
    move-wide p6, v2

    .line 140
    invoke-direct/range {p1 .. p7}, Lx0/d;-><init>(Lx0/F;ZJJ)V

    .line 141
    .line 142
    .line 143
    move-object v1, v4

    .line 144
    :cond_1
    iput-object v1, v0, Lh0/V;->a:Ljava/lang/Object;

    .line 145
    .line 146
    return-void
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
.method public final a(LA0/A;JZ[Z)J
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    iget v4, v1, LA0/A;->a:I

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    if-ge v3, v4, :cond_1

    .line 11
    .line 12
    if-nez p4, :cond_0

    .line 13
    .line 14
    iget-object v4, v0, Lh0/V;->o:LA0/A;

    .line 15
    .line 16
    invoke-virtual {v1, v4, v3}, LA0/A;->a(LA0/A;I)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    move v5, v2

    .line 24
    :goto_1
    iget-object v4, v0, Lh0/V;->i:[Z

    .line 25
    .line 26
    aput-boolean v5, v4, v3

    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v3, v2

    .line 32
    :goto_2
    iget-object v4, v0, Lh0/V;->j:[Lh0/q0;

    .line 33
    .line 34
    array-length v6, v4

    .line 35
    const/4 v7, -0x2

    .line 36
    iget-object v8, v0, Lh0/V;->c:[Lx0/f0;

    .line 37
    .line 38
    if-ge v3, v6, :cond_3

    .line 39
    .line 40
    aget-object v4, v4, v3

    .line 41
    .line 42
    invoke-interface {v4}, Lh0/q0;->getTrackType()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-ne v4, v7, :cond_2

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    aput-object v4, v8, v3

    .line 50
    .line 51
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    invoke-virtual/range {p0 .. p0}, Lh0/V;->b()V

    .line 55
    .line 56
    .line 57
    iput-object v1, v0, Lh0/V;->o:LA0/A;

    .line 58
    .line 59
    invoke-virtual/range {p0 .. p0}, Lh0/V;->c()V

    .line 60
    .line 61
    .line 62
    iget-object v9, v0, Lh0/V;->a:Ljava/lang/Object;

    .line 63
    .line 64
    iget-object v12, v0, Lh0/V;->c:[Lx0/f0;

    .line 65
    .line 66
    iget-object v10, v1, LA0/A;->c:[LA0/w;

    .line 67
    .line 68
    iget-object v11, v0, Lh0/V;->i:[Z

    .line 69
    .line 70
    move-object/from16 v13, p5

    .line 71
    .line 72
    move-wide/from16 v14, p2

    .line 73
    .line 74
    invoke-interface/range {v9 .. v15}, Lx0/F;->f([LA0/w;[Z[Lx0/f0;[ZJ)J

    .line 75
    .line 76
    .line 77
    move-result-wide v9

    .line 78
    move v3, v2

    .line 79
    :goto_3
    array-length v6, v4

    .line 80
    if-ge v3, v6, :cond_5

    .line 81
    .line 82
    aget-object v6, v4, v3

    .line 83
    .line 84
    invoke-interface {v6}, Lh0/q0;->getTrackType()I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-ne v6, v7, :cond_4

    .line 89
    .line 90
    iget-object v6, v0, Lh0/V;->o:LA0/A;

    .line 91
    .line 92
    invoke-virtual {v6, v3}, LA0/A;->b(I)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v6, :cond_4

    .line 97
    .line 98
    new-instance v6, Lx0/w;

    .line 99
    .line 100
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 101
    .line 102
    .line 103
    aput-object v6, v8, v3

    .line 104
    .line 105
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_5
    iput-boolean v2, v0, Lh0/V;->f:Z

    .line 109
    .line 110
    move v3, v2

    .line 111
    :goto_4
    array-length v6, v8

    .line 112
    if-ge v3, v6, :cond_9

    .line 113
    .line 114
    aget-object v6, v8, v3

    .line 115
    .line 116
    if-eqz v6, :cond_6

    .line 117
    .line 118
    invoke-virtual {v1, v3}, LA0/A;->b(I)Z

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    invoke-static {v6}, Ld0/m;->h(Z)V

    .line 123
    .line 124
    .line 125
    aget-object v6, v4, v3

    .line 126
    .line 127
    invoke-interface {v6}, Lh0/q0;->getTrackType()I

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-eq v6, v7, :cond_8

    .line 132
    .line 133
    iput-boolean v5, v0, Lh0/V;->f:Z

    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_6
    iget-object v6, v1, LA0/A;->c:[LA0/w;

    .line 137
    .line 138
    aget-object v6, v6, v3

    .line 139
    .line 140
    if-nez v6, :cond_7

    .line 141
    .line 142
    move v6, v5

    .line 143
    goto :goto_5

    .line 144
    :cond_7
    move v6, v2

    .line 145
    :goto_5
    invoke-static {v6}, Ld0/m;->h(Z)V

    .line 146
    .line 147
    .line 148
    :cond_8
    :goto_6
    add-int/lit8 v3, v3, 0x1

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_9
    return-wide v9
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

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lh0/V;->m:Lh0/V;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    iget-object v1, p0, Lh0/V;->o:LA0/A;

    .line 7
    .line 8
    iget v2, v1, LA0/A;->a:I

    .line 9
    .line 10
    if-ge v0, v2, :cond_1

    .line 11
    .line 12
    invoke-virtual {v1, v0}, LA0/A;->b(I)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v2, p0, Lh0/V;->o:LA0/A;

    .line 17
    .line 18
    iget-object v2, v2, LA0/A;->c:[LA0/w;

    .line 19
    .line 20
    aget-object v2, v2, v0

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-interface {v2}, LA0/w;->disable()V

    .line 27
    .line 28
    .line 29
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return-void
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

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lh0/V;->m:Lh0/V;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    iget-object v1, p0, Lh0/V;->o:LA0/A;

    .line 7
    .line 8
    iget v2, v1, LA0/A;->a:I

    .line 9
    .line 10
    if-ge v0, v2, :cond_1

    .line 11
    .line 12
    invoke-virtual {v1, v0}, LA0/A;->b(I)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v2, p0, Lh0/V;->o:LA0/A;

    .line 17
    .line 18
    iget-object v2, v2, LA0/A;->c:[LA0/w;

    .line 19
    .line 20
    aget-object v2, v2, v0

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-interface {v2}, LA0/w;->h()V

    .line 27
    .line 28
    .line 29
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return-void
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

.method public final d()J
    .locals 5

    .line 1
    iget-boolean v0, p0, Lh0/V;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lh0/V;->g:Lh0/W;

    .line 6
    .line 7
    iget-wide v0, v0, Lh0/W;->b:J

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    iget-boolean v0, p0, Lh0/V;->f:Z

    .line 11
    .line 12
    const-wide/high16 v1, -0x8000000000000000L

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lh0/V;->a:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-interface {v0}, Lx0/h0;->h()J

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move-wide v3, v1

    .line 24
    :goto_0
    cmp-long v0, v3, v1

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Lh0/V;->g:Lh0/W;

    .line 29
    .line 30
    iget-wide v3, v0, Lh0/W;->e:J

    .line 31
    .line 32
    :cond_2
    return-wide v3
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

.method public final e()J
    .locals 4

    .line 1
    iget-object v0, p0, Lh0/V;->g:Lh0/W;

    .line 2
    .line 3
    iget-wide v0, v0, Lh0/W;->b:J

    .line 4
    .line 5
    iget-wide v2, p0, Lh0/V;->p:J

    .line 6
    .line 7
    add-long/2addr v0, v2

    .line 8
    return-wide v0
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

.method public final f(FLa0/U;Z)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lh0/V;->e:Z

    .line 3
    .line 4
    iget-object v0, p0, Lh0/V;->a:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-interface {v0}, Lx0/F;->e()Lx0/q0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lh0/V;->n:Lx0/q0;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2, p3}, Lh0/V;->j(FLa0/U;Z)LA0/A;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object p1, p0, Lh0/V;->g:Lh0/W;

    .line 17
    .line 18
    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    iget-wide v0, p1, Lh0/W;->e:J

    .line 24
    .line 25
    cmp-long p2, v0, p2

    .line 26
    .line 27
    iget-wide v3, p1, Lh0/W;->b:J

    .line 28
    .line 29
    if-eqz p2, :cond_0

    .line 30
    .line 31
    cmp-long p1, v3, v0

    .line 32
    .line 33
    if-ltz p1, :cond_0

    .line 34
    .line 35
    const-wide/16 p1, 0x1

    .line 36
    .line 37
    sub-long/2addr v0, p1

    .line 38
    const-wide/16 p1, 0x0

    .line 39
    .line 40
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    move-wide v3, p1

    .line 45
    :cond_0
    iget-object p1, p0, Lh0/V;->j:[Lh0/q0;

    .line 46
    .line 47
    array-length p1, p1

    .line 48
    new-array v6, p1, [Z

    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    move-object v1, p0

    .line 52
    invoke-virtual/range {v1 .. v6}, Lh0/V;->a(LA0/A;JZ[Z)J

    .line 53
    .line 54
    .line 55
    move-result-wide p1

    .line 56
    iget-wide v0, p0, Lh0/V;->p:J

    .line 57
    .line 58
    iget-object p3, p0, Lh0/V;->g:Lh0/W;

    .line 59
    .line 60
    iget-wide v2, p3, Lh0/W;->b:J

    .line 61
    .line 62
    sub-long/2addr v2, p1

    .line 63
    add-long/2addr v2, v0

    .line 64
    iput-wide v2, p0, Lh0/V;->p:J

    .line 65
    .line 66
    invoke-virtual {p3, p1, p2}, Lh0/W;->b(J)Lh0/W;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, Lh0/V;->g:Lh0/W;

    .line 71
    .line 72
    return-void
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

.method public final g()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lh0/V;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lh0/V;->f:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lh0/V;->a:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-interface {v0}, Lx0/h0;->h()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    const-wide/high16 v2, -0x8000000000000000L

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    :cond_0
    const/4 v0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    :goto_0
    return v0
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

.method public final h()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lh0/V;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lh0/V;->g()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lh0/V;->d()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-object v2, p0, Lh0/V;->g:Lh0/W;

    .line 16
    .line 17
    iget-wide v2, v2, Lh0/W;->b:J

    .line 18
    .line 19
    sub-long/2addr v0, v2

    .line 20
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    cmp-long v0, v0, v2

    .line 26
    .line 27
    if-ltz v0, :cond_1

    .line 28
    .line 29
    :cond_0
    const/4 v0, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v0, 0x0

    .line 32
    :goto_0
    return v0
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

.method public final i()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lh0/V;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh0/V;->a:Ljava/lang/Object;

    .line 5
    .line 6
    :try_start_0
    instance-of v1, v0, Lx0/d;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    iget-object v2, p0, Lh0/V;->l:Lh0/g0;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    :try_start_1
    check-cast v0, Lx0/d;

    .line 13
    .line 14
    iget-object v0, v0, Lx0/d;->l:Lx0/F;

    .line 15
    .line 16
    invoke-virtual {v2, v0}, Lh0/g0;->f(Lx0/F;)V

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :catch_0
    move-exception v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v2, v0}, Lh0/g0;->f(Lx0/F;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :goto_0
    const-string v1, "MediaPeriodHolder"

    .line 27
    .line 28
    const-string v2, "Period release failed."

    .line 29
    .line 30
    invoke-static {v1, v2, v0}, Ld0/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    :goto_1
    return-void
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

.method public final j(FLa0/U;Z)LA0/A;
    .locals 34

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v4, 0x5

    .line 4
    const/4 v6, 0x1

    .line 5
    iget-object v7, v1, Lh0/V;->k:LA0/z;

    .line 6
    .line 7
    iget-object v8, v1, Lh0/V;->j:[Lh0/q0;

    .line 8
    .line 9
    iget-object v9, v1, Lh0/V;->n:Lx0/q0;

    .line 10
    .line 11
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    array-length v10, v8

    .line 15
    add-int/2addr v10, v6

    .line 16
    new-array v10, v10, [I

    .line 17
    .line 18
    array-length v11, v8

    .line 19
    add-int/2addr v11, v6

    .line 20
    new-array v12, v11, [[La0/V;

    .line 21
    .line 22
    array-length v13, v8

    .line 23
    add-int/2addr v13, v6

    .line 24
    new-array v13, v13, [[[I

    .line 25
    .line 26
    const/4 v14, 0x0

    .line 27
    :goto_0
    if-ge v14, v11, :cond_0

    .line 28
    .line 29
    iget v15, v9, Lx0/q0;->a:I

    .line 30
    .line 31
    new-array v3, v15, [La0/V;

    .line 32
    .line 33
    aput-object v3, v12, v14

    .line 34
    .line 35
    new-array v3, v15, [[I

    .line 36
    .line 37
    aput-object v3, v13, v14

    .line 38
    .line 39
    add-int/2addr v14, v6

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    array-length v3, v8

    .line 42
    new-array v11, v3, [I

    .line 43
    .line 44
    const/4 v14, 0x0

    .line 45
    :goto_1
    if-ge v14, v3, :cond_1

    .line 46
    .line 47
    aget-object v15, v8, v14

    .line 48
    .line 49
    invoke-interface {v15}, Lh0/q0;->supportsMixedMimeTypeAdaptation()I

    .line 50
    .line 51
    .line 52
    move-result v15

    .line 53
    aput v15, v11, v14

    .line 54
    .line 55
    add-int/2addr v14, v6

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    const/4 v3, 0x0

    .line 58
    :goto_2
    iget v14, v9, Lx0/q0;->a:I

    .line 59
    .line 60
    if-ge v3, v14, :cond_a

    .line 61
    .line 62
    invoke-virtual {v9, v3}, Lx0/q0;->a(I)La0/V;

    .line 63
    .line 64
    .line 65
    move-result-object v14

    .line 66
    iget v15, v14, La0/V;->c:I

    .line 67
    .line 68
    if-ne v15, v4, :cond_2

    .line 69
    .line 70
    move v15, v6

    .line 71
    goto :goto_3

    .line 72
    :cond_2
    const/4 v15, 0x0

    .line 73
    :goto_3
    array-length v2, v8

    .line 74
    move/from16 v16, v6

    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    const/4 v4, 0x0

    .line 78
    :goto_4
    array-length v5, v8

    .line 79
    if-ge v0, v5, :cond_7

    .line 80
    .line 81
    aget-object v5, v8, v0

    .line 82
    .line 83
    move-object/from16 v17, v9

    .line 84
    .line 85
    const/4 v6, 0x0

    .line 86
    const/4 v9, 0x0

    .line 87
    :goto_5
    iget v1, v14, La0/V;->a:I

    .line 88
    .line 89
    if-ge v6, v1, :cond_3

    .line 90
    .line 91
    iget-object v1, v14, La0/V;->d:[La0/p;

    .line 92
    .line 93
    aget-object v1, v1, v6

    .line 94
    .line 95
    invoke-interface {v5, v1}, Lh0/q0;->supportsFormat(La0/p;)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    and-int/lit8 v1, v1, 0x7

    .line 100
    .line 101
    invoke-static {v9, v1}, Ljava/lang/Math;->max(II)I

    .line 102
    .line 103
    .line 104
    move-result v9

    .line 105
    const/4 v1, 0x1

    .line 106
    add-int/2addr v6, v1

    .line 107
    goto :goto_5

    .line 108
    :cond_3
    aget v1, v10, v0

    .line 109
    .line 110
    if-nez v1, :cond_4

    .line 111
    .line 112
    const/4 v1, 0x1

    .line 113
    goto :goto_6

    .line 114
    :cond_4
    const/4 v1, 0x0

    .line 115
    :goto_6
    if-gt v9, v4, :cond_6

    .line 116
    .line 117
    if-ne v9, v4, :cond_5

    .line 118
    .line 119
    if-eqz v15, :cond_5

    .line 120
    .line 121
    if-nez v16, :cond_5

    .line 122
    .line 123
    if-eqz v1, :cond_5

    .line 124
    .line 125
    goto :goto_8

    .line 126
    :cond_5
    :goto_7
    const/4 v1, 0x1

    .line 127
    goto :goto_9

    .line 128
    :cond_6
    :goto_8
    move v2, v0

    .line 129
    move/from16 v16, v1

    .line 130
    .line 131
    move v4, v9

    .line 132
    goto :goto_7

    .line 133
    :goto_9
    add-int/2addr v0, v1

    .line 134
    move v6, v1

    .line 135
    move-object/from16 v9, v17

    .line 136
    .line 137
    move-object/from16 v1, p0

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_7
    move-object/from16 v17, v9

    .line 141
    .line 142
    array-length v0, v8

    .line 143
    if-ne v2, v0, :cond_8

    .line 144
    .line 145
    iget v0, v14, La0/V;->a:I

    .line 146
    .line 147
    new-array v0, v0, [I

    .line 148
    .line 149
    const/4 v5, 0x1

    .line 150
    goto :goto_b

    .line 151
    :cond_8
    aget-object v0, v8, v2

    .line 152
    .line 153
    iget v1, v14, La0/V;->a:I

    .line 154
    .line 155
    new-array v1, v1, [I

    .line 156
    .line 157
    const/4 v4, 0x0

    .line 158
    :goto_a
    iget v5, v14, La0/V;->a:I

    .line 159
    .line 160
    if-ge v4, v5, :cond_9

    .line 161
    .line 162
    iget-object v5, v14, La0/V;->d:[La0/p;

    .line 163
    .line 164
    aget-object v5, v5, v4

    .line 165
    .line 166
    invoke-interface {v0, v5}, Lh0/q0;->supportsFormat(La0/p;)I

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    aput v5, v1, v4

    .line 171
    .line 172
    const/4 v5, 0x1

    .line 173
    add-int/2addr v4, v5

    .line 174
    goto :goto_a

    .line 175
    :cond_9
    const/4 v5, 0x1

    .line 176
    move-object v0, v1

    .line 177
    :goto_b
    aget v1, v10, v2

    .line 178
    .line 179
    aget-object v4, v12, v2

    .line 180
    .line 181
    aput-object v14, v4, v1

    .line 182
    .line 183
    aget-object v4, v13, v2

    .line 184
    .line 185
    aput-object v0, v4, v1

    .line 186
    .line 187
    add-int/2addr v1, v5

    .line 188
    aput v1, v10, v2

    .line 189
    .line 190
    add-int/2addr v3, v5

    .line 191
    move-object/from16 v1, p0

    .line 192
    .line 193
    move v6, v5

    .line 194
    move-object/from16 v9, v17

    .line 195
    .line 196
    const/4 v4, 0x5

    .line 197
    goto/16 :goto_2

    .line 198
    .line 199
    :cond_a
    array-length v0, v8

    .line 200
    new-array v0, v0, [Lx0/q0;

    .line 201
    .line 202
    array-length v1, v8

    .line 203
    new-array v1, v1, [Ljava/lang/String;

    .line 204
    .line 205
    array-length v2, v8

    .line 206
    new-array v15, v2, [I

    .line 207
    .line 208
    const/4 v2, 0x0

    .line 209
    :goto_c
    array-length v3, v8

    .line 210
    if-ge v2, v3, :cond_b

    .line 211
    .line 212
    aget v3, v10, v2

    .line 213
    .line 214
    new-instance v4, Lx0/q0;

    .line 215
    .line 216
    aget-object v5, v12, v2

    .line 217
    .line 218
    invoke-static {v3, v5}, Ld0/w;->O(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    check-cast v5, [La0/V;

    .line 223
    .line 224
    invoke-direct {v4, v5}, Lx0/q0;-><init>([La0/V;)V

    .line 225
    .line 226
    .line 227
    aput-object v4, v0, v2

    .line 228
    .line 229
    aget-object v4, v13, v2

    .line 230
    .line 231
    invoke-static {v3, v4}, Ld0/w;->O(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    check-cast v3, [[I

    .line 236
    .line 237
    aput-object v3, v13, v2

    .line 238
    .line 239
    aget-object v3, v8, v2

    .line 240
    .line 241
    invoke-interface {v3}, Lh0/q0;->getName()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    aput-object v3, v1, v2

    .line 246
    .line 247
    aget-object v3, v8, v2

    .line 248
    .line 249
    invoke-interface {v3}, Lh0/q0;->getTrackType()I

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    aput v3, v15, v2

    .line 254
    .line 255
    const/4 v3, 0x1

    .line 256
    add-int/2addr v2, v3

    .line 257
    goto :goto_c

    .line 258
    :cond_b
    array-length v1, v8

    .line 259
    aget v1, v10, v1

    .line 260
    .line 261
    new-instance v2, Lx0/q0;

    .line 262
    .line 263
    array-length v3, v8

    .line 264
    aget-object v3, v12, v3

    .line 265
    .line 266
    invoke-static {v1, v3}, Ld0/w;->O(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    check-cast v1, [La0/V;

    .line 271
    .line 272
    invoke-direct {v2, v1}, Lx0/q0;-><init>([La0/V;)V

    .line 273
    .line 274
    .line 275
    new-instance v1, LA0/y;

    .line 276
    .line 277
    move-object v14, v1

    .line 278
    move-object/from16 v16, v0

    .line 279
    .line 280
    move-object/from16 v17, v11

    .line 281
    .line 282
    move-object/from16 v18, v13

    .line 283
    .line 284
    move-object/from16 v19, v2

    .line 285
    .line 286
    invoke-direct/range {v14 .. v19}, LA0/y;-><init>([I[Lx0/q0;[I[[[ILx0/q0;)V

    .line 287
    .line 288
    .line 289
    check-cast v7, LA0/u;

    .line 290
    .line 291
    iget-object v2, v7, LA0/u;->c:Ljava/lang/Object;

    .line 292
    .line 293
    monitor-enter v2

    .line 294
    :try_start_0
    iget-object v0, v7, LA0/u;->g:LA0/m;

    .line 295
    .line 296
    iget-boolean v3, v0, LA0/m;->v:Z

    .line 297
    .line 298
    if-eqz v3, :cond_d

    .line 299
    .line 300
    sget v3, Ld0/w;->a:I

    .line 301
    .line 302
    const/16 v4, 0x20

    .line 303
    .line 304
    if-lt v3, v4, :cond_d

    .line 305
    .line 306
    iget-object v3, v7, LA0/u;->h:LA0/p;

    .line 307
    .line 308
    if-eqz v3, :cond_d

    .line 309
    .line 310
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    invoke-static {v4}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    iget-object v5, v3, LA0/p;->d:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v5, LA0/o;

    .line 320
    .line 321
    if-nez v5, :cond_d

    .line 322
    .line 323
    iget-object v5, v3, LA0/p;->c:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v5, Landroid/os/Handler;

    .line 326
    .line 327
    if-eqz v5, :cond_c

    .line 328
    .line 329
    goto :goto_e

    .line 330
    :cond_c
    new-instance v5, LA0/o;

    .line 331
    .line 332
    invoke-direct {v5, v7}, LA0/o;-><init>(LA0/u;)V

    .line 333
    .line 334
    .line 335
    iput-object v5, v3, LA0/p;->d:Ljava/lang/Object;

    .line 336
    .line 337
    new-instance v5, Landroid/os/Handler;

    .line 338
    .line 339
    invoke-direct {v5, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 340
    .line 341
    .line 342
    iput-object v5, v3, LA0/p;->c:Ljava/lang/Object;

    .line 343
    .line 344
    iget-object v4, v3, LA0/p;->b:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v4, Landroid/media/Spatializer;

    .line 347
    .line 348
    new-instance v6, Lj0/t;

    .line 349
    .line 350
    invoke-direct {v6, v5}, Lj0/t;-><init>(Landroid/os/Handler;)V

    .line 351
    .line 352
    .line 353
    iget-object v3, v3, LA0/p;->d:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v3, LA0/o;

    .line 356
    .line 357
    invoke-static {v4, v6, v3}, LA0/n;->f(Landroid/media/Spatializer;Lj0/t;LA0/o;)V

    .line 358
    .line 359
    .line 360
    goto :goto_e

    .line 361
    :goto_d
    move-object/from16 v3, p0

    .line 362
    .line 363
    goto/16 :goto_63

    .line 364
    .line 365
    :catchall_0
    move-exception v0

    .line 366
    goto :goto_d

    .line 367
    :cond_d
    :goto_e
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 368
    iget v2, v1, LA0/y;->a:I

    .line 369
    .line 370
    new-array v3, v2, [LA0/v;

    .line 371
    .line 372
    iget-object v4, v0, La0/Z;->m:La0/X;

    .line 373
    .line 374
    iget v4, v4, La0/X;->a:I

    .line 375
    .line 376
    const/4 v5, 0x2

    .line 377
    if-ne v4, v5, :cond_e

    .line 378
    .line 379
    const/4 v4, 0x0

    .line 380
    goto :goto_f

    .line 381
    :cond_e
    new-instance v4, LA0/g;

    .line 382
    .line 383
    const/4 v6, 0x0

    .line 384
    invoke-direct {v4, v0, v6, v11}, LA0/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    new-instance v6, LA/c;

    .line 388
    .line 389
    const/4 v8, 0x5

    .line 390
    invoke-direct {v6, v8}, LA/c;-><init>(I)V

    .line 391
    .line 392
    .line 393
    invoke-static {v5, v1, v13, v4, v6}, LA0/u;->h(ILA0/y;[[[ILA0/r;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 394
    .line 395
    .line 396
    move-result-object v4

    .line 397
    :goto_f
    iget-object v6, v0, La0/Z;->m:La0/X;

    .line 398
    .line 399
    if-nez v4, :cond_10

    .line 400
    .line 401
    iget v8, v6, La0/X;->a:I

    .line 402
    .line 403
    if-ne v8, v5, :cond_f

    .line 404
    .line 405
    goto :goto_10

    .line 406
    :cond_f
    new-instance v8, LA0/e;

    .line 407
    .line 408
    invoke-direct {v8, v0}, LA0/e;-><init>(LA0/m;)V

    .line 409
    .line 410
    .line 411
    new-instance v9, LA/c;

    .line 412
    .line 413
    const/4 v10, 0x3

    .line 414
    invoke-direct {v9, v10}, LA/c;-><init>(I)V

    .line 415
    .line 416
    .line 417
    const/4 v10, 0x4

    .line 418
    invoke-static {v10, v1, v13, v8, v9}, LA0/u;->h(ILA0/y;[[[ILA0/r;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 419
    .line 420
    .line 421
    move-result-object v8

    .line 422
    goto :goto_11

    .line 423
    :cond_10
    :goto_10
    const/4 v8, 0x0

    .line 424
    :goto_11
    if-eqz v8, :cond_11

    .line 425
    .line 426
    iget-object v4, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v4, Ljava/lang/Integer;

    .line 429
    .line 430
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 431
    .line 432
    .line 433
    move-result v4

    .line 434
    iget-object v8, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v8, LA0/v;

    .line 437
    .line 438
    aput-object v8, v3, v4

    .line 439
    .line 440
    goto :goto_12

    .line 441
    :cond_11
    if-eqz v4, :cond_12

    .line 442
    .line 443
    iget-object v8, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 444
    .line 445
    check-cast v8, Ljava/lang/Integer;

    .line 446
    .line 447
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 448
    .line 449
    .line 450
    move-result v8

    .line 451
    iget-object v4, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast v4, LA0/v;

    .line 454
    .line 455
    aput-object v4, v3, v8

    .line 456
    .line 457
    :cond_12
    :goto_12
    const/4 v4, 0x0

    .line 458
    :goto_13
    iget-object v8, v1, LA0/y;->d:Ljava/lang/Object;

    .line 459
    .line 460
    check-cast v8, [Lx0/q0;

    .line 461
    .line 462
    iget-object v9, v1, LA0/y;->b:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast v9, [I

    .line 465
    .line 466
    iget v10, v1, LA0/y;->a:I

    .line 467
    .line 468
    if-ge v4, v10, :cond_14

    .line 469
    .line 470
    aget v10, v9, v4

    .line 471
    .line 472
    if-ne v5, v10, :cond_13

    .line 473
    .line 474
    aget-object v10, v8, v4

    .line 475
    .line 476
    iget v10, v10, Lx0/q0;->a:I

    .line 477
    .line 478
    if-lez v10, :cond_13

    .line 479
    .line 480
    const/4 v4, 0x1

    .line 481
    const/4 v10, 0x1

    .line 482
    goto :goto_14

    .line 483
    :cond_13
    const/4 v10, 0x1

    .line 484
    add-int/2addr v4, v10

    .line 485
    goto :goto_13

    .line 486
    :cond_14
    const/4 v10, 0x1

    .line 487
    const/4 v4, 0x0

    .line 488
    :goto_14
    new-instance v12, LA0/f;

    .line 489
    .line 490
    invoke-direct {v12, v7, v0, v4, v11}, LA0/f;-><init>(LA0/u;LA0/m;Z[I)V

    .line 491
    .line 492
    .line 493
    new-instance v4, LA/c;

    .line 494
    .line 495
    const/4 v11, 0x4

    .line 496
    invoke-direct {v4, v11}, LA/c;-><init>(I)V

    .line 497
    .line 498
    .line 499
    invoke-static {v10, v1, v13, v12, v4}, LA0/u;->h(ILA0/y;[[[ILA0/r;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 500
    .line 501
    .line 502
    move-result-object v4

    .line 503
    if-eqz v4, :cond_15

    .line 504
    .line 505
    iget-object v10, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v10, Ljava/lang/Integer;

    .line 508
    .line 509
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 510
    .line 511
    .line 512
    move-result v10

    .line 513
    iget-object v11, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 514
    .line 515
    check-cast v11, LA0/v;

    .line 516
    .line 517
    aput-object v11, v3, v10

    .line 518
    .line 519
    :cond_15
    if-nez v4, :cond_16

    .line 520
    .line 521
    const/4 v4, 0x0

    .line 522
    goto :goto_15

    .line 523
    :cond_16
    iget-object v4, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 524
    .line 525
    check-cast v4, LA0/v;

    .line 526
    .line 527
    iget-object v10, v4, LA0/v;->a:La0/V;

    .line 528
    .line 529
    iget-object v4, v4, LA0/v;->b:[I

    .line 530
    .line 531
    const/4 v11, 0x0

    .line 532
    aget v4, v4, v11

    .line 533
    .line 534
    iget-object v10, v10, La0/V;->d:[La0/p;

    .line 535
    .line 536
    aget-object v4, v10, v4

    .line 537
    .line 538
    iget-object v4, v4, La0/p;->d:Ljava/lang/String;

    .line 539
    .line 540
    :goto_15
    iget v10, v6, La0/X;->a:I

    .line 541
    .line 542
    if-ne v10, v5, :cond_17

    .line 543
    .line 544
    const/4 v4, 0x0

    .line 545
    goto :goto_16

    .line 546
    :cond_17
    new-instance v10, LA0/g;

    .line 547
    .line 548
    const/4 v11, 0x1

    .line 549
    invoke-direct {v10, v0, v11, v4}, LA0/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 550
    .line 551
    .line 552
    new-instance v4, LA/c;

    .line 553
    .line 554
    const/4 v11, 0x6

    .line 555
    invoke-direct {v4, v11}, LA/c;-><init>(I)V

    .line 556
    .line 557
    .line 558
    const/4 v11, 0x3

    .line 559
    invoke-static {v11, v1, v13, v10, v4}, LA0/u;->h(ILA0/y;[[[ILA0/r;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 560
    .line 561
    .line 562
    move-result-object v4

    .line 563
    :goto_16
    if-eqz v4, :cond_18

    .line 564
    .line 565
    iget-object v10, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 566
    .line 567
    check-cast v10, Ljava/lang/Integer;

    .line 568
    .line 569
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 570
    .line 571
    .line 572
    move-result v10

    .line 573
    iget-object v4, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 574
    .line 575
    check-cast v4, LA0/v;

    .line 576
    .line 577
    aput-object v4, v3, v10

    .line 578
    .line 579
    :cond_18
    const/4 v4, 0x0

    .line 580
    :goto_17
    if-ge v4, v2, :cond_22

    .line 581
    .line 582
    aget v10, v9, v4

    .line 583
    .line 584
    if-eq v10, v5, :cond_20

    .line 585
    .line 586
    const/4 v11, 0x1

    .line 587
    if-eq v10, v11, :cond_21

    .line 588
    .line 589
    const/4 v11, 0x3

    .line 590
    if-eq v10, v11, :cond_20

    .line 591
    .line 592
    const/4 v12, 0x4

    .line 593
    if-eq v10, v12, :cond_20

    .line 594
    .line 595
    aget-object v10, v8, v4

    .line 596
    .line 597
    aget-object v12, v13, v4

    .line 598
    .line 599
    iget v14, v6, La0/X;->a:I

    .line 600
    .line 601
    if-ne v14, v5, :cond_19

    .line 602
    .line 603
    move-object/from16 v19, v6

    .line 604
    .line 605
    move-object/from16 v21, v8

    .line 606
    .line 607
    move-object/from16 v23, v9

    .line 608
    .line 609
    :goto_18
    const/4 v5, 0x0

    .line 610
    goto/16 :goto_1e

    .line 611
    .line 612
    :cond_19
    const/4 v5, 0x0

    .line 613
    const/4 v14, 0x0

    .line 614
    const/4 v15, 0x0

    .line 615
    const/16 v17, 0x0

    .line 616
    .line 617
    :goto_19
    iget v11, v10, Lx0/q0;->a:I

    .line 618
    .line 619
    if-ge v5, v11, :cond_1e

    .line 620
    .line 621
    invoke-virtual {v10, v5}, Lx0/q0;->a(I)La0/V;

    .line 622
    .line 623
    .line 624
    move-result-object v11

    .line 625
    aget-object v18, v12, v5

    .line 626
    .line 627
    move-object/from16 v19, v6

    .line 628
    .line 629
    move-object/from16 v21, v8

    .line 630
    .line 631
    const/4 v6, 0x0

    .line 632
    :goto_1a
    iget v8, v11, La0/V;->a:I

    .line 633
    .line 634
    if-ge v6, v8, :cond_1d

    .line 635
    .line 636
    aget v8, v18, v6

    .line 637
    .line 638
    move-object/from16 v23, v9

    .line 639
    .line 640
    iget-boolean v9, v0, LA0/m;->w:Z

    .line 641
    .line 642
    invoke-static {v8, v9}, Lh0/q0;->g(IZ)Z

    .line 643
    .line 644
    .line 645
    move-result v8

    .line 646
    if-eqz v8, :cond_1c

    .line 647
    .line 648
    iget-object v8, v11, La0/V;->d:[La0/p;

    .line 649
    .line 650
    aget-object v8, v8, v6

    .line 651
    .line 652
    new-instance v9, LA0/k;

    .line 653
    .line 654
    move-object/from16 v24, v10

    .line 655
    .line 656
    aget v10, v18, v6

    .line 657
    .line 658
    invoke-direct {v9, v8, v10}, LA0/k;-><init>(La0/p;I)V

    .line 659
    .line 660
    .line 661
    if-eqz v15, :cond_1a

    .line 662
    .line 663
    sget-object v8, Lm2/z;->a:Lm2/x;

    .line 664
    .line 665
    iget-boolean v10, v15, LA0/k;->m:Z

    .line 666
    .line 667
    move-object/from16 v25, v11

    .line 668
    .line 669
    iget-boolean v11, v9, LA0/k;->m:Z

    .line 670
    .line 671
    invoke-virtual {v8, v11, v10}, Lm2/x;->c(ZZ)Lm2/z;

    .line 672
    .line 673
    .line 674
    move-result-object v8

    .line 675
    iget-boolean v10, v9, LA0/k;->l:Z

    .line 676
    .line 677
    iget-boolean v11, v15, LA0/k;->l:Z

    .line 678
    .line 679
    invoke-virtual {v8, v10, v11}, Lm2/z;->c(ZZ)Lm2/z;

    .line 680
    .line 681
    .line 682
    move-result-object v8

    .line 683
    invoke-virtual {v8}, Lm2/z;->e()I

    .line 684
    .line 685
    .line 686
    move-result v8

    .line 687
    if-lez v8, :cond_1b

    .line 688
    .line 689
    goto :goto_1b

    .line 690
    :cond_1a
    move-object/from16 v25, v11

    .line 691
    .line 692
    :goto_1b
    move/from16 v17, v6

    .line 693
    .line 694
    move-object v15, v9

    .line 695
    move-object/from16 v14, v25

    .line 696
    .line 697
    :cond_1b
    :goto_1c
    const/4 v8, 0x1

    .line 698
    goto :goto_1d

    .line 699
    :cond_1c
    move-object/from16 v24, v10

    .line 700
    .line 701
    move-object/from16 v25, v11

    .line 702
    .line 703
    goto :goto_1c

    .line 704
    :goto_1d
    add-int/2addr v6, v8

    .line 705
    move-object/from16 v9, v23

    .line 706
    .line 707
    move-object/from16 v10, v24

    .line 708
    .line 709
    move-object/from16 v11, v25

    .line 710
    .line 711
    goto :goto_1a

    .line 712
    :cond_1d
    move-object/from16 v23, v9

    .line 713
    .line 714
    move-object/from16 v24, v10

    .line 715
    .line 716
    const/4 v8, 0x1

    .line 717
    add-int/2addr v5, v8

    .line 718
    move-object/from16 v6, v19

    .line 719
    .line 720
    move-object/from16 v8, v21

    .line 721
    .line 722
    goto :goto_19

    .line 723
    :cond_1e
    move-object/from16 v19, v6

    .line 724
    .line 725
    move-object/from16 v21, v8

    .line 726
    .line 727
    move-object/from16 v23, v9

    .line 728
    .line 729
    if-nez v14, :cond_1f

    .line 730
    .line 731
    goto :goto_18

    .line 732
    :cond_1f
    new-instance v5, LA0/v;

    .line 733
    .line 734
    filled-new-array/range {v17 .. v17}, [I

    .line 735
    .line 736
    .line 737
    move-result-object v6

    .line 738
    invoke-direct {v5, v14, v6}, LA0/v;-><init>(La0/V;[I)V

    .line 739
    .line 740
    .line 741
    :goto_1e
    aput-object v5, v3, v4

    .line 742
    .line 743
    :goto_1f
    const/4 v5, 0x1

    .line 744
    goto :goto_20

    .line 745
    :cond_20
    move-object/from16 v19, v6

    .line 746
    .line 747
    move-object/from16 v21, v8

    .line 748
    .line 749
    move-object/from16 v23, v9

    .line 750
    .line 751
    goto :goto_1f

    .line 752
    :cond_21
    move-object/from16 v19, v6

    .line 753
    .line 754
    move-object/from16 v21, v8

    .line 755
    .line 756
    move-object/from16 v23, v9

    .line 757
    .line 758
    move v5, v11

    .line 759
    :goto_20
    add-int/2addr v4, v5

    .line 760
    move-object/from16 v6, v19

    .line 761
    .line 762
    move-object/from16 v8, v21

    .line 763
    .line 764
    move-object/from16 v9, v23

    .line 765
    .line 766
    const/4 v5, 0x2

    .line 767
    goto/16 :goto_17

    .line 768
    .line 769
    :cond_22
    iget v4, v1, LA0/y;->a:I

    .line 770
    .line 771
    new-instance v5, Ljava/util/HashMap;

    .line 772
    .line 773
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 774
    .line 775
    .line 776
    const/4 v6, 0x0

    .line 777
    :goto_21
    if-ge v6, v4, :cond_25

    .line 778
    .line 779
    iget-object v8, v1, LA0/y;->d:Ljava/lang/Object;

    .line 780
    .line 781
    check-cast v8, [Lx0/q0;

    .line 782
    .line 783
    aget-object v8, v8, v6

    .line 784
    .line 785
    const/4 v9, 0x0

    .line 786
    :goto_22
    iget v10, v8, Lx0/q0;->a:I

    .line 787
    .line 788
    if-ge v9, v10, :cond_24

    .line 789
    .line 790
    invoke-virtual {v8, v9}, Lx0/q0;->a(I)La0/V;

    .line 791
    .line 792
    .line 793
    move-result-object v10

    .line 794
    iget-object v11, v0, La0/Z;->p:Lm2/g0;

    .line 795
    .line 796
    invoke-virtual {v11, v10}, Lm2/g0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-result-object v10

    .line 800
    if-nez v10, :cond_23

    .line 801
    .line 802
    const/4 v10, 0x1

    .line 803
    add-int/2addr v9, v10

    .line 804
    goto :goto_22

    .line 805
    :cond_23
    new-instance v0, Ljava/lang/ClassCastException;

    .line 806
    .line 807
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 808
    .line 809
    .line 810
    throw v0

    .line 811
    :cond_24
    const/4 v10, 0x1

    .line 812
    add-int/2addr v6, v10

    .line 813
    goto :goto_21

    .line 814
    :cond_25
    iget-object v6, v1, LA0/y;->f:Ljava/lang/Object;

    .line 815
    .line 816
    check-cast v6, Lx0/q0;

    .line 817
    .line 818
    const/4 v8, 0x0

    .line 819
    :goto_23
    iget v9, v6, Lx0/q0;->a:I

    .line 820
    .line 821
    if-ge v8, v9, :cond_27

    .line 822
    .line 823
    invoke-virtual {v6, v8}, Lx0/q0;->a(I)La0/V;

    .line 824
    .line 825
    .line 826
    move-result-object v9

    .line 827
    iget-object v10, v0, La0/Z;->p:Lm2/g0;

    .line 828
    .line 829
    invoke-virtual {v10, v9}, Lm2/g0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object v9

    .line 833
    if-nez v9, :cond_26

    .line 834
    .line 835
    const/4 v9, 0x1

    .line 836
    add-int/2addr v8, v9

    .line 837
    goto :goto_23

    .line 838
    :cond_26
    new-instance v0, Ljava/lang/ClassCastException;

    .line 839
    .line 840
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 841
    .line 842
    .line 843
    throw v0

    .line 844
    :cond_27
    const/4 v6, 0x0

    .line 845
    :goto_24
    if-ge v6, v4, :cond_29

    .line 846
    .line 847
    iget-object v8, v1, LA0/y;->b:Ljava/lang/Object;

    .line 848
    .line 849
    check-cast v8, [I

    .line 850
    .line 851
    aget v8, v8, v6

    .line 852
    .line 853
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 854
    .line 855
    .line 856
    move-result-object v8

    .line 857
    invoke-virtual {v5, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 858
    .line 859
    .line 860
    move-result-object v8

    .line 861
    if-nez v8, :cond_28

    .line 862
    .line 863
    const/4 v8, 0x1

    .line 864
    add-int/2addr v6, v8

    .line 865
    goto :goto_24

    .line 866
    :cond_28
    new-instance v0, Ljava/lang/ClassCastException;

    .line 867
    .line 868
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 869
    .line 870
    .line 871
    throw v0

    .line 872
    :cond_29
    iget v4, v1, LA0/y;->a:I

    .line 873
    .line 874
    const/4 v5, 0x0

    .line 875
    :goto_25
    if-ge v5, v4, :cond_2d

    .line 876
    .line 877
    iget-object v6, v1, LA0/y;->d:Ljava/lang/Object;

    .line 878
    .line 879
    check-cast v6, [Lx0/q0;

    .line 880
    .line 881
    aget-object v6, v6, v5

    .line 882
    .line 883
    iget-object v8, v0, LA0/m;->y:Landroid/util/SparseArray;

    .line 884
    .line 885
    invoke-virtual {v8, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 886
    .line 887
    .line 888
    move-result-object v8

    .line 889
    check-cast v8, Ljava/util/Map;

    .line 890
    .line 891
    if-eqz v8, :cond_2c

    .line 892
    .line 893
    invoke-interface {v8, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 894
    .line 895
    .line 896
    move-result v8

    .line 897
    if-eqz v8, :cond_2c

    .line 898
    .line 899
    iget-object v8, v0, LA0/m;->y:Landroid/util/SparseArray;

    .line 900
    .line 901
    invoke-virtual {v8, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 902
    .line 903
    .line 904
    move-result-object v8

    .line 905
    check-cast v8, Ljava/util/Map;

    .line 906
    .line 907
    if-eqz v8, :cond_2a

    .line 908
    .line 909
    invoke-interface {v8, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 910
    .line 911
    .line 912
    move-result-object v6

    .line 913
    if-nez v6, :cond_2b

    .line 914
    .line 915
    :cond_2a
    const/4 v6, 0x0

    .line 916
    goto :goto_26

    .line 917
    :cond_2b
    new-instance v0, Ljava/lang/ClassCastException;

    .line 918
    .line 919
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 920
    .line 921
    .line 922
    throw v0

    .line 923
    :goto_26
    aput-object v6, v3, v5

    .line 924
    .line 925
    :cond_2c
    const/4 v6, 0x1

    .line 926
    add-int/2addr v5, v6

    .line 927
    goto :goto_25

    .line 928
    :cond_2d
    const/4 v4, 0x0

    .line 929
    :goto_27
    if-ge v4, v2, :cond_30

    .line 930
    .line 931
    iget-object v5, v1, LA0/y;->b:Ljava/lang/Object;

    .line 932
    .line 933
    check-cast v5, [I

    .line 934
    .line 935
    aget v5, v5, v4

    .line 936
    .line 937
    iget-object v6, v0, LA0/m;->z:Landroid/util/SparseBooleanArray;

    .line 938
    .line 939
    invoke-virtual {v6, v4}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 940
    .line 941
    .line 942
    move-result v6

    .line 943
    if-nez v6, :cond_2e

    .line 944
    .line 945
    iget-object v6, v0, La0/Z;->q:Lm2/M;

    .line 946
    .line 947
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 948
    .line 949
    .line 950
    move-result-object v5

    .line 951
    invoke-virtual {v6, v5}, Lm2/D;->contains(Ljava/lang/Object;)Z

    .line 952
    .line 953
    .line 954
    move-result v5

    .line 955
    if-eqz v5, :cond_2f

    .line 956
    .line 957
    :cond_2e
    const/4 v5, 0x0

    .line 958
    goto :goto_29

    .line 959
    :cond_2f
    :goto_28
    const/4 v5, 0x1

    .line 960
    goto :goto_2a

    .line 961
    :goto_29
    aput-object v5, v3, v4

    .line 962
    .line 963
    goto :goto_28

    .line 964
    :goto_2a
    add-int/2addr v4, v5

    .line 965
    goto :goto_27

    .line 966
    :cond_30
    iget-object v4, v7, LA0/u;->e:LA0/b;

    .line 967
    .line 968
    iget-object v5, v7, LA0/z;->b:LB0/e;

    .line 969
    .line 970
    invoke-static {v5}, Ld0/m;->i(Ljava/lang/Object;)V

    .line 971
    .line 972
    .line 973
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 974
    .line 975
    .line 976
    new-instance v4, Ljava/util/ArrayList;

    .line 977
    .line 978
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 979
    .line 980
    .line 981
    const/4 v6, 0x0

    .line 982
    :goto_2b
    array-length v7, v3

    .line 983
    const-wide/16 v8, 0x0

    .line 984
    .line 985
    if-ge v6, v7, :cond_33

    .line 986
    .line 987
    aget-object v7, v3, v6

    .line 988
    .line 989
    if-eqz v7, :cond_32

    .line 990
    .line 991
    iget-object v7, v7, LA0/v;->b:[I

    .line 992
    .line 993
    array-length v7, v7

    .line 994
    const/4 v10, 0x1

    .line 995
    if-le v7, v10, :cond_31

    .line 996
    .line 997
    invoke-static {}, Lm2/I;->n()Lm2/F;

    .line 998
    .line 999
    .line 1000
    move-result-object v7

    .line 1001
    new-instance v11, LA0/a;

    .line 1002
    .line 1003
    invoke-direct {v11, v8, v9, v8, v9}, LA0/a;-><init>(JJ)V

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v7, v11}, Lm2/F;->c(Ljava/lang/Object;)V

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1010
    .line 1011
    .line 1012
    const/4 v7, 0x0

    .line 1013
    goto :goto_2e

    .line 1014
    :cond_31
    :goto_2c
    const/4 v7, 0x0

    .line 1015
    goto :goto_2d

    .line 1016
    :cond_32
    const/4 v10, 0x1

    .line 1017
    goto :goto_2c

    .line 1018
    :goto_2d
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1019
    .line 1020
    .line 1021
    :goto_2e
    add-int/2addr v6, v10

    .line 1022
    goto :goto_2b

    .line 1023
    :cond_33
    const/4 v7, 0x0

    .line 1024
    array-length v6, v3

    .line 1025
    new-array v10, v6, [[J

    .line 1026
    .line 1027
    const/4 v11, 0x0

    .line 1028
    :goto_2f
    array-length v12, v3

    .line 1029
    if-ge v11, v12, :cond_37

    .line 1030
    .line 1031
    aget-object v12, v3, v11

    .line 1032
    .line 1033
    if-nez v12, :cond_34

    .line 1034
    .line 1035
    const/4 v7, 0x0

    .line 1036
    new-array v12, v7, [J

    .line 1037
    .line 1038
    aput-object v12, v10, v11

    .line 1039
    .line 1040
    const/4 v9, 0x1

    .line 1041
    goto :goto_31

    .line 1042
    :cond_34
    iget-object v7, v12, LA0/v;->b:[I

    .line 1043
    .line 1044
    array-length v8, v7

    .line 1045
    new-array v8, v8, [J

    .line 1046
    .line 1047
    aput-object v8, v10, v11

    .line 1048
    .line 1049
    const/4 v8, 0x0

    .line 1050
    :goto_30
    array-length v9, v7

    .line 1051
    if-ge v8, v9, :cond_36

    .line 1052
    .line 1053
    aget v9, v7, v8

    .line 1054
    .line 1055
    iget-object v14, v12, LA0/v;->a:La0/V;

    .line 1056
    .line 1057
    iget-object v14, v14, La0/V;->d:[La0/p;

    .line 1058
    .line 1059
    aget-object v9, v14, v9

    .line 1060
    .line 1061
    iget v9, v9, La0/p;->j:I

    .line 1062
    .line 1063
    int-to-long v14, v9

    .line 1064
    aget-object v9, v10, v11

    .line 1065
    .line 1066
    const-wide/16 v20, -0x1

    .line 1067
    .line 1068
    cmp-long v19, v14, v20

    .line 1069
    .line 1070
    if-nez v19, :cond_35

    .line 1071
    .line 1072
    const-wide/16 v14, 0x0

    .line 1073
    .line 1074
    :cond_35
    aput-wide v14, v9, v8

    .line 1075
    .line 1076
    const/4 v9, 0x1

    .line 1077
    add-int/2addr v8, v9

    .line 1078
    goto :goto_30

    .line 1079
    :cond_36
    const/4 v9, 0x1

    .line 1080
    aget-object v7, v10, v11

    .line 1081
    .line 1082
    invoke-static {v7}, Ljava/util/Arrays;->sort([J)V

    .line 1083
    .line 1084
    .line 1085
    :goto_31
    add-int/2addr v11, v9

    .line 1086
    const/4 v7, 0x0

    .line 1087
    const-wide/16 v8, 0x0

    .line 1088
    .line 1089
    goto :goto_2f

    .line 1090
    :cond_37
    new-array v7, v6, [I

    .line 1091
    .line 1092
    new-array v8, v6, [J

    .line 1093
    .line 1094
    const/4 v9, 0x0

    .line 1095
    :goto_32
    if-ge v9, v6, :cond_39

    .line 1096
    .line 1097
    aget-object v11, v10, v9

    .line 1098
    .line 1099
    array-length v12, v11

    .line 1100
    if-nez v12, :cond_38

    .line 1101
    .line 1102
    const-wide/16 v14, 0x0

    .line 1103
    .line 1104
    goto :goto_33

    .line 1105
    :cond_38
    const/4 v12, 0x0

    .line 1106
    aget-wide v14, v11, v12

    .line 1107
    .line 1108
    :goto_33
    aput-wide v14, v8, v9

    .line 1109
    .line 1110
    const/4 v11, 0x1

    .line 1111
    add-int/2addr v9, v11

    .line 1112
    goto :goto_32

    .line 1113
    :cond_39
    invoke-static {v4, v8}, LA0/c;->u(Ljava/util/ArrayList;[J)V

    .line 1114
    .line 1115
    .line 1116
    sget-object v9, Lm2/Z;->l:Lm2/Z;

    .line 1117
    .line 1118
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1119
    .line 1120
    .line 1121
    new-instance v11, Lm2/W;

    .line 1122
    .line 1123
    invoke-direct {v11, v9}, Lm2/W;-><init>(Lm2/Z;)V

    .line 1124
    .line 1125
    .line 1126
    invoke-virtual {v11}, Lm2/r;->a()Landroidx/lifecycle/E;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v9

    .line 1130
    invoke-virtual {v9}, Landroidx/lifecycle/E;->x()Lm2/Y;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v9

    .line 1134
    const/4 v11, 0x0

    .line 1135
    :goto_34
    if-ge v11, v6, :cond_42

    .line 1136
    .line 1137
    aget-object v12, v10, v11

    .line 1138
    .line 1139
    array-length v14, v12

    .line 1140
    const/4 v15, 0x1

    .line 1141
    if-gt v14, v15, :cond_3a

    .line 1142
    .line 1143
    move-object/from16 v19, v0

    .line 1144
    .line 1145
    move/from16 v17, v6

    .line 1146
    .line 1147
    move-object/from16 v18, v13

    .line 1148
    .line 1149
    move/from16 v22, v15

    .line 1150
    .line 1151
    const-wide/16 v20, -0x1

    .line 1152
    .line 1153
    move-object v13, v1

    .line 1154
    goto/16 :goto_3a

    .line 1155
    .line 1156
    :cond_3a
    array-length v12, v12

    .line 1157
    new-array v14, v12, [D

    .line 1158
    .line 1159
    move/from16 v17, v6

    .line 1160
    .line 1161
    const/4 v15, 0x0

    .line 1162
    :goto_35
    aget-object v6, v10, v11

    .line 1163
    .line 1164
    move-object/from16 v18, v13

    .line 1165
    .line 1166
    array-length v13, v6

    .line 1167
    const-wide/16 v23, 0x0

    .line 1168
    .line 1169
    if-ge v15, v13, :cond_3c

    .line 1170
    .line 1171
    move-object/from16 v19, v0

    .line 1172
    .line 1173
    move-object v13, v1

    .line 1174
    aget-wide v0, v6, v15

    .line 1175
    .line 1176
    const-wide/16 v20, -0x1

    .line 1177
    .line 1178
    cmp-long v6, v0, v20

    .line 1179
    .line 1180
    if-nez v6, :cond_3b

    .line 1181
    .line 1182
    goto :goto_36

    .line 1183
    :cond_3b
    long-to-double v0, v0

    .line 1184
    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    .line 1185
    .line 1186
    .line 1187
    move-result-wide v23

    .line 1188
    :goto_36
    aput-wide v23, v14, v15

    .line 1189
    .line 1190
    const/4 v0, 0x1

    .line 1191
    add-int/2addr v15, v0

    .line 1192
    move-object v1, v13

    .line 1193
    move-object/from16 v13, v18

    .line 1194
    .line 1195
    move-object/from16 v0, v19

    .line 1196
    .line 1197
    goto :goto_35

    .line 1198
    :cond_3c
    move-object/from16 v19, v0

    .line 1199
    .line 1200
    move-object v13, v1

    .line 1201
    const/4 v0, 0x1

    .line 1202
    const-wide/16 v20, -0x1

    .line 1203
    .line 1204
    sub-int/2addr v12, v0

    .line 1205
    aget-wide v25, v14, v12

    .line 1206
    .line 1207
    const/4 v1, 0x0

    .line 1208
    aget-wide v27, v14, v1

    .line 1209
    .line 1210
    sub-double v25, v25, v27

    .line 1211
    .line 1212
    const/4 v1, 0x0

    .line 1213
    :goto_37
    if-ge v1, v12, :cond_41

    .line 1214
    .line 1215
    aget-wide v27, v14, v1

    .line 1216
    .line 1217
    add-int/2addr v1, v0

    .line 1218
    aget-wide v29, v14, v1

    .line 1219
    .line 1220
    add-double v27, v27, v29

    .line 1221
    .line 1222
    const-wide/high16 v29, 0x3fe0000000000000L    # 0.5

    .line 1223
    .line 1224
    mul-double v27, v27, v29

    .line 1225
    .line 1226
    cmpl-double v0, v25, v23

    .line 1227
    .line 1228
    if-nez v0, :cond_3d

    .line 1229
    .line 1230
    const-wide/high16 v27, 0x3ff0000000000000L    # 1.0

    .line 1231
    .line 1232
    goto :goto_38

    .line 1233
    :cond_3d
    const/4 v0, 0x0

    .line 1234
    aget-wide v29, v14, v0

    .line 1235
    .line 1236
    sub-double v27, v27, v29

    .line 1237
    .line 1238
    div-double v27, v27, v25

    .line 1239
    .line 1240
    :goto_38
    invoke-static/range {v27 .. v28}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v0

    .line 1244
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v6

    .line 1248
    iget-object v15, v9, Lm2/Y;->o:Ljava/util/Map;

    .line 1249
    .line 1250
    invoke-interface {v15, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v27

    .line 1254
    move/from16 v28, v1

    .line 1255
    .line 1256
    move-object/from16 v1, v27

    .line 1257
    .line 1258
    check-cast v1, Ljava/util/Collection;

    .line 1259
    .line 1260
    if-nez v1, :cond_3f

    .line 1261
    .line 1262
    invoke-virtual {v9}, Lm2/Y;->d()Ljava/util/Collection;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v1

    .line 1266
    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1267
    .line 1268
    .line 1269
    move-result v6

    .line 1270
    if-eqz v6, :cond_3e

    .line 1271
    .line 1272
    iget v6, v9, Lm2/Y;->p:I

    .line 1273
    .line 1274
    const/16 v22, 0x1

    .line 1275
    .line 1276
    add-int/lit8 v6, v6, 0x1

    .line 1277
    .line 1278
    iput v6, v9, Lm2/Y;->p:I

    .line 1279
    .line 1280
    invoke-interface {v15, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1281
    .line 1282
    .line 1283
    goto :goto_39

    .line 1284
    :cond_3e
    new-instance v0, Ljava/lang/AssertionError;

    .line 1285
    .line 1286
    const-string v1, "New Collection violated the Collection spec"

    .line 1287
    .line 1288
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 1289
    .line 1290
    .line 1291
    throw v0

    .line 1292
    :cond_3f
    const/16 v22, 0x1

    .line 1293
    .line 1294
    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1295
    .line 1296
    .line 1297
    move-result v0

    .line 1298
    if-eqz v0, :cond_40

    .line 1299
    .line 1300
    iget v0, v9, Lm2/Y;->p:I

    .line 1301
    .line 1302
    add-int/lit8 v0, v0, 0x1

    .line 1303
    .line 1304
    iput v0, v9, Lm2/Y;->p:I

    .line 1305
    .line 1306
    :cond_40
    :goto_39
    move/from16 v0, v22

    .line 1307
    .line 1308
    move/from16 v1, v28

    .line 1309
    .line 1310
    goto :goto_37

    .line 1311
    :cond_41
    move/from16 v22, v0

    .line 1312
    .line 1313
    :goto_3a
    add-int/lit8 v11, v11, 0x1

    .line 1314
    .line 1315
    move-object v1, v13

    .line 1316
    move/from16 v6, v17

    .line 1317
    .line 1318
    move-object/from16 v13, v18

    .line 1319
    .line 1320
    move-object/from16 v0, v19

    .line 1321
    .line 1322
    goto/16 :goto_34

    .line 1323
    .line 1324
    :cond_42
    move-object/from16 v19, v0

    .line 1325
    .line 1326
    move-object/from16 v18, v13

    .line 1327
    .line 1328
    move-object v13, v1

    .line 1329
    iget-object v0, v9, Lm2/o;->m:Ljava/util/Collection;

    .line 1330
    .line 1331
    if-nez v0, :cond_43

    .line 1332
    .line 1333
    new-instance v0, Lm2/n;

    .line 1334
    .line 1335
    const/4 v1, 0x0

    .line 1336
    invoke-direct {v0, v1, v9}, Lm2/n;-><init>(ILjava/io/Serializable;)V

    .line 1337
    .line 1338
    .line 1339
    iput-object v0, v9, Lm2/o;->m:Ljava/util/Collection;

    .line 1340
    .line 1341
    :cond_43
    invoke-static {v0}, Lm2/I;->p(Ljava/util/Collection;)Lm2/I;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v0

    .line 1345
    const/4 v1, 0x0

    .line 1346
    :goto_3b
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 1347
    .line 1348
    .line 1349
    move-result v6

    .line 1350
    if-ge v1, v6, :cond_44

    .line 1351
    .line 1352
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v6

    .line 1356
    check-cast v6, Ljava/lang/Integer;

    .line 1357
    .line 1358
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 1359
    .line 1360
    .line 1361
    move-result v6

    .line 1362
    aget v9, v7, v6

    .line 1363
    .line 1364
    const/4 v11, 0x1

    .line 1365
    add-int/2addr v9, v11

    .line 1366
    aput v9, v7, v6

    .line 1367
    .line 1368
    aget-object v12, v10, v6

    .line 1369
    .line 1370
    aget-wide v14, v12, v9

    .line 1371
    .line 1372
    aput-wide v14, v8, v6

    .line 1373
    .line 1374
    invoke-static {v4, v8}, LA0/c;->u(Ljava/util/ArrayList;[J)V

    .line 1375
    .line 1376
    .line 1377
    add-int/2addr v1, v11

    .line 1378
    goto :goto_3b

    .line 1379
    :cond_44
    const/4 v0, 0x0

    .line 1380
    :goto_3c
    array-length v1, v3

    .line 1381
    if-ge v0, v1, :cond_46

    .line 1382
    .line 1383
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v1

    .line 1387
    if-eqz v1, :cond_45

    .line 1388
    .line 1389
    aget-wide v6, v8, v0

    .line 1390
    .line 1391
    const-wide/16 v9, 0x2

    .line 1392
    .line 1393
    mul-long/2addr v6, v9

    .line 1394
    aput-wide v6, v8, v0

    .line 1395
    .line 1396
    :cond_45
    const/4 v1, 0x1

    .line 1397
    add-int/2addr v0, v1

    .line 1398
    goto :goto_3c

    .line 1399
    :cond_46
    invoke-static {v4, v8}, LA0/c;->u(Ljava/util/ArrayList;[J)V

    .line 1400
    .line 1401
    .line 1402
    invoke-static {}, Lm2/I;->n()Lm2/F;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v0

    .line 1406
    const/4 v1, 0x0

    .line 1407
    :goto_3d
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1408
    .line 1409
    .line 1410
    move-result v6

    .line 1411
    if-ge v1, v6, :cond_48

    .line 1412
    .line 1413
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v6

    .line 1417
    check-cast v6, Lm2/F;

    .line 1418
    .line 1419
    if-nez v6, :cond_47

    .line 1420
    .line 1421
    invoke-static {}, Lm2/I;->s()Lm2/b0;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v6

    .line 1425
    goto :goto_3e

    .line 1426
    :cond_47
    invoke-virtual {v6}, Lm2/F;->g()Lm2/b0;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v6

    .line 1430
    :goto_3e
    invoke-virtual {v0, v6}, Lm2/F;->c(Ljava/lang/Object;)V

    .line 1431
    .line 1432
    .line 1433
    const/4 v6, 0x1

    .line 1434
    add-int/2addr v1, v6

    .line 1435
    goto :goto_3d

    .line 1436
    :cond_48
    invoke-virtual {v0}, Lm2/F;->g()Lm2/b0;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v0

    .line 1440
    array-length v1, v3

    .line 1441
    new-array v1, v1, [LA0/w;

    .line 1442
    .line 1443
    const/4 v4, 0x0

    .line 1444
    :goto_3f
    array-length v6, v3

    .line 1445
    if-ge v4, v6, :cond_4c

    .line 1446
    .line 1447
    aget-object v6, v3, v4

    .line 1448
    .line 1449
    if-eqz v6, :cond_49

    .line 1450
    .line 1451
    iget-object v7, v6, LA0/v;->b:[I

    .line 1452
    .line 1453
    array-length v8, v7

    .line 1454
    if-nez v8, :cond_4a

    .line 1455
    .line 1456
    :cond_49
    :goto_40
    const/4 v6, 0x1

    .line 1457
    goto :goto_42

    .line 1458
    :cond_4a
    array-length v8, v7

    .line 1459
    const/4 v9, 0x1

    .line 1460
    if-ne v8, v9, :cond_4b

    .line 1461
    .line 1462
    new-instance v8, LA0/x;

    .line 1463
    .line 1464
    const/4 v9, 0x0

    .line 1465
    aget v7, v7, v9

    .line 1466
    .line 1467
    iget-object v6, v6, LA0/v;->a:La0/V;

    .line 1468
    .line 1469
    filled-new-array {v7}, [I

    .line 1470
    .line 1471
    .line 1472
    move-result-object v7

    .line 1473
    invoke-direct {v8, v6, v7}, LA0/d;-><init>(La0/V;[I)V

    .line 1474
    .line 1475
    .line 1476
    goto :goto_41

    .line 1477
    :cond_4b
    invoke-virtual {v0, v4}, Lm2/b0;->get(I)Ljava/lang/Object;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v8

    .line 1481
    move-object/from16 v33, v8

    .line 1482
    .line 1483
    check-cast v33, Lm2/I;

    .line 1484
    .line 1485
    new-instance v8, LA0/c;

    .line 1486
    .line 1487
    const/16 v9, 0x2710

    .line 1488
    .line 1489
    int-to-long v9, v9

    .line 1490
    const/16 v11, 0x61a8

    .line 1491
    .line 1492
    int-to-long v11, v11

    .line 1493
    iget-object v6, v6, LA0/v;->a:La0/V;

    .line 1494
    .line 1495
    move-object/from16 v23, v8

    .line 1496
    .line 1497
    move-object/from16 v24, v6

    .line 1498
    .line 1499
    move-object/from16 v25, v7

    .line 1500
    .line 1501
    move-object/from16 v26, v5

    .line 1502
    .line 1503
    move-wide/from16 v27, v9

    .line 1504
    .line 1505
    move-wide/from16 v29, v11

    .line 1506
    .line 1507
    move-wide/from16 v31, v11

    .line 1508
    .line 1509
    invoke-direct/range {v23 .. v33}, LA0/c;-><init>(La0/V;[ILB0/e;JJJLm2/I;)V

    .line 1510
    .line 1511
    .line 1512
    :goto_41
    aput-object v8, v1, v4

    .line 1513
    .line 1514
    goto :goto_40

    .line 1515
    :goto_42
    add-int/2addr v4, v6

    .line 1516
    goto :goto_3f

    .line 1517
    :cond_4c
    new-array v0, v2, [Lh0/r0;

    .line 1518
    .line 1519
    const/4 v3, 0x0

    .line 1520
    :goto_43
    const/4 v4, -0x2

    .line 1521
    if-ge v3, v2, :cond_50

    .line 1522
    .line 1523
    move-object v5, v13

    .line 1524
    iget-object v6, v5, LA0/y;->b:Ljava/lang/Object;

    .line 1525
    .line 1526
    check-cast v6, [I

    .line 1527
    .line 1528
    aget v6, v6, v3

    .line 1529
    .line 1530
    move-object/from16 v7, v19

    .line 1531
    .line 1532
    iget-object v8, v7, LA0/m;->z:Landroid/util/SparseBooleanArray;

    .line 1533
    .line 1534
    invoke-virtual {v8, v3}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 1535
    .line 1536
    .line 1537
    move-result v8

    .line 1538
    if-nez v8, :cond_4f

    .line 1539
    .line 1540
    iget-object v8, v7, La0/Z;->q:Lm2/M;

    .line 1541
    .line 1542
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v6

    .line 1546
    invoke-virtual {v8, v6}, Lm2/D;->contains(Ljava/lang/Object;)Z

    .line 1547
    .line 1548
    .line 1549
    move-result v6

    .line 1550
    if-eqz v6, :cond_4d

    .line 1551
    .line 1552
    goto :goto_44

    .line 1553
    :cond_4d
    iget-object v6, v5, LA0/y;->b:Ljava/lang/Object;

    .line 1554
    .line 1555
    check-cast v6, [I

    .line 1556
    .line 1557
    aget v6, v6, v3

    .line 1558
    .line 1559
    if-eq v6, v4, :cond_4e

    .line 1560
    .line 1561
    aget-object v4, v1, v3

    .line 1562
    .line 1563
    if-eqz v4, :cond_4f

    .line 1564
    .line 1565
    :cond_4e
    sget-object v6, Lh0/r0;->c:Lh0/r0;

    .line 1566
    .line 1567
    goto :goto_45

    .line 1568
    :cond_4f
    :goto_44
    const/4 v6, 0x0

    .line 1569
    :goto_45
    aput-object v6, v0, v3

    .line 1570
    .line 1571
    const/4 v4, 0x1

    .line 1572
    add-int/2addr v3, v4

    .line 1573
    move-object v13, v5

    .line 1574
    move-object/from16 v19, v7

    .line 1575
    .line 1576
    goto :goto_43

    .line 1577
    :cond_50
    move-object v5, v13

    .line 1578
    move-object/from16 v7, v19

    .line 1579
    .line 1580
    iget-object v2, v7, La0/Z;->m:La0/X;

    .line 1581
    .line 1582
    iget v2, v2, La0/X;->a:I

    .line 1583
    .line 1584
    if-eqz v2, :cond_57

    .line 1585
    .line 1586
    const/4 v2, 0x0

    .line 1587
    const/4 v6, 0x0

    .line 1588
    const/4 v8, -0x1

    .line 1589
    :goto_46
    iget v9, v5, LA0/y;->a:I

    .line 1590
    .line 1591
    if-ge v6, v9, :cond_54

    .line 1592
    .line 1593
    iget-object v9, v5, LA0/y;->b:Ljava/lang/Object;

    .line 1594
    .line 1595
    check-cast v9, [I

    .line 1596
    .line 1597
    aget v9, v9, v6

    .line 1598
    .line 1599
    aget-object v10, v1, v6

    .line 1600
    .line 1601
    const/4 v11, 0x1

    .line 1602
    if-eq v9, v11, :cond_51

    .line 1603
    .line 1604
    if-eqz v10, :cond_51

    .line 1605
    .line 1606
    goto :goto_4a

    .line 1607
    :cond_51
    if-ne v9, v11, :cond_53

    .line 1608
    .line 1609
    if-eqz v10, :cond_53

    .line 1610
    .line 1611
    invoke-interface {v10}, LA0/w;->length()I

    .line 1612
    .line 1613
    .line 1614
    move-result v9

    .line 1615
    if-ne v9, v11, :cond_53

    .line 1616
    .line 1617
    iget-object v9, v5, LA0/y;->d:Ljava/lang/Object;

    .line 1618
    .line 1619
    check-cast v9, [Lx0/q0;

    .line 1620
    .line 1621
    aget-object v9, v9, v6

    .line 1622
    .line 1623
    invoke-interface {v10}, LA0/w;->b()La0/V;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v11

    .line 1627
    invoke-virtual {v9, v11}, Lx0/q0;->b(La0/V;)I

    .line 1628
    .line 1629
    .line 1630
    move-result v9

    .line 1631
    aget-object v11, v18, v6

    .line 1632
    .line 1633
    aget-object v9, v11, v9

    .line 1634
    .line 1635
    const/4 v11, 0x0

    .line 1636
    invoke-interface {v10, v11}, LA0/w;->k(I)I

    .line 1637
    .line 1638
    .line 1639
    move-result v12

    .line 1640
    aget v9, v9, v12

    .line 1641
    .line 1642
    invoke-interface {v10}, LA0/w;->d()La0/p;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v10

    .line 1646
    invoke-static {v7, v9, v10}, LA0/u;->g(LA0/m;ILa0/p;)Z

    .line 1647
    .line 1648
    .line 1649
    move-result v9

    .line 1650
    if-eqz v9, :cond_52

    .line 1651
    .line 1652
    const/4 v9, 0x1

    .line 1653
    add-int/2addr v2, v9

    .line 1654
    move v8, v6

    .line 1655
    goto :goto_47

    .line 1656
    :cond_52
    const/4 v9, 0x1

    .line 1657
    goto :goto_47

    .line 1658
    :cond_53
    move v9, v11

    .line 1659
    :goto_47
    add-int/2addr v6, v9

    .line 1660
    goto :goto_46

    .line 1661
    :cond_54
    const/4 v9, 0x1

    .line 1662
    if-ne v2, v9, :cond_57

    .line 1663
    .line 1664
    new-instance v2, Lh0/r0;

    .line 1665
    .line 1666
    iget-object v6, v7, La0/Z;->m:La0/X;

    .line 1667
    .line 1668
    iget-boolean v6, v6, La0/X;->b:Z

    .line 1669
    .line 1670
    if-eqz v6, :cond_55

    .line 1671
    .line 1672
    const/4 v6, 0x1

    .line 1673
    goto :goto_48

    .line 1674
    :cond_55
    const/4 v6, 0x2

    .line 1675
    :goto_48
    aget-object v7, v0, v8

    .line 1676
    .line 1677
    if-eqz v7, :cond_56

    .line 1678
    .line 1679
    iget-boolean v7, v7, Lh0/r0;->b:Z

    .line 1680
    .line 1681
    if-eqz v7, :cond_56

    .line 1682
    .line 1683
    const/4 v7, 0x1

    .line 1684
    goto :goto_49

    .line 1685
    :cond_56
    const/4 v7, 0x0

    .line 1686
    :goto_49
    invoke-direct {v2, v6, v7}, Lh0/r0;-><init>(IZ)V

    .line 1687
    .line 1688
    .line 1689
    aput-object v2, v0, v8

    .line 1690
    .line 1691
    :cond_57
    :goto_4a
    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 1692
    .line 1693
    .line 1694
    move-result-object v0

    .line 1695
    iget-object v1, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1696
    .line 1697
    check-cast v1, [LA0/w;

    .line 1698
    .line 1699
    array-length v2, v1

    .line 1700
    new-array v2, v2, [Ljava/util/List;

    .line 1701
    .line 1702
    const/4 v6, 0x0

    .line 1703
    :goto_4b
    array-length v7, v1

    .line 1704
    if-ge v6, v7, :cond_59

    .line 1705
    .line 1706
    aget-object v7, v1, v6

    .line 1707
    .line 1708
    if-eqz v7, :cond_58

    .line 1709
    .line 1710
    invoke-static {v7}, Lm2/I;->u(Ljava/lang/Object;)Lm2/b0;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v7

    .line 1714
    goto :goto_4c

    .line 1715
    :cond_58
    sget-object v7, Lm2/I;->m:Lm2/G;

    .line 1716
    .line 1717
    sget-object v7, Lm2/b0;->p:Lm2/b0;

    .line 1718
    .line 1719
    :goto_4c
    aput-object v7, v2, v6

    .line 1720
    .line 1721
    const/4 v7, 0x1

    .line 1722
    add-int/2addr v6, v7

    .line 1723
    goto :goto_4b

    .line 1724
    :cond_59
    new-instance v1, Lm2/F;

    .line 1725
    .line 1726
    const/4 v6, 0x4

    .line 1727
    invoke-direct {v1, v6}, Lm2/C;-><init>(I)V

    .line 1728
    .line 1729
    .line 1730
    const/4 v6, 0x0

    .line 1731
    :goto_4d
    iget v7, v5, LA0/y;->a:I

    .line 1732
    .line 1733
    if-ge v6, v7, :cond_65

    .line 1734
    .line 1735
    iget-object v7, v5, LA0/y;->d:Ljava/lang/Object;

    .line 1736
    .line 1737
    check-cast v7, [Lx0/q0;

    .line 1738
    .line 1739
    aget-object v8, v7, v6

    .line 1740
    .line 1741
    aget-object v9, v2, v6

    .line 1742
    .line 1743
    const/4 v10, 0x0

    .line 1744
    :goto_4e
    iget v11, v8, Lx0/q0;->a:I

    .line 1745
    .line 1746
    if-ge v10, v11, :cond_64

    .line 1747
    .line 1748
    invoke-virtual {v8, v10}, Lx0/q0;->a(I)La0/V;

    .line 1749
    .line 1750
    .line 1751
    move-result-object v11

    .line 1752
    aget-object v12, v7, v6

    .line 1753
    .line 1754
    invoke-virtual {v12, v10}, Lx0/q0;->a(I)La0/V;

    .line 1755
    .line 1756
    .line 1757
    move-result-object v12

    .line 1758
    iget v12, v12, La0/V;->a:I

    .line 1759
    .line 1760
    new-array v13, v12, [I

    .line 1761
    .line 1762
    const/4 v14, 0x0

    .line 1763
    const/4 v15, 0x0

    .line 1764
    :goto_4f
    if-ge v14, v12, :cond_5b

    .line 1765
    .line 1766
    iget-object v4, v5, LA0/y;->e:Ljava/lang/Object;

    .line 1767
    .line 1768
    check-cast v4, [[[I

    .line 1769
    .line 1770
    aget-object v4, v4, v6

    .line 1771
    .line 1772
    aget-object v4, v4, v10

    .line 1773
    .line 1774
    aget v4, v4, v14

    .line 1775
    .line 1776
    and-int/lit8 v4, v4, 0x7

    .line 1777
    .line 1778
    const/4 v3, 0x4

    .line 1779
    if-eq v4, v3, :cond_5a

    .line 1780
    .line 1781
    const/4 v4, 0x1

    .line 1782
    goto :goto_50

    .line 1783
    :cond_5a
    const/4 v4, 0x1

    .line 1784
    add-int/lit8 v18, v15, 0x1

    .line 1785
    .line 1786
    aput v14, v13, v15

    .line 1787
    .line 1788
    move/from16 v15, v18

    .line 1789
    .line 1790
    :goto_50
    add-int/2addr v14, v4

    .line 1791
    const/4 v4, -0x2

    .line 1792
    goto :goto_4f

    .line 1793
    :cond_5b
    const/4 v3, 0x4

    .line 1794
    invoke-static {v13, v15}, Ljava/util/Arrays;->copyOf([II)[I

    .line 1795
    .line 1796
    .line 1797
    move-result-object v4

    .line 1798
    const/16 v12, 0x10

    .line 1799
    .line 1800
    move-object/from16 v18, v2

    .line 1801
    .line 1802
    move v3, v12

    .line 1803
    const/4 v12, 0x0

    .line 1804
    const/4 v13, 0x0

    .line 1805
    const/4 v14, 0x0

    .line 1806
    const/4 v15, 0x0

    .line 1807
    :goto_51
    array-length v2, v4

    .line 1808
    if-ge v12, v2, :cond_5d

    .line 1809
    .line 1810
    aget v2, v4, v12

    .line 1811
    .line 1812
    move-object/from16 v19, v4

    .line 1813
    .line 1814
    aget-object v4, v7, v6

    .line 1815
    .line 1816
    invoke-virtual {v4, v10}, Lx0/q0;->a(I)La0/V;

    .line 1817
    .line 1818
    .line 1819
    move-result-object v4

    .line 1820
    iget-object v4, v4, La0/V;->d:[La0/p;

    .line 1821
    .line 1822
    aget-object v2, v4, v2

    .line 1823
    .line 1824
    iget-object v2, v2, La0/p;->n:Ljava/lang/String;

    .line 1825
    .line 1826
    const/4 v4, 0x1

    .line 1827
    add-int/lit8 v20, v14, 0x1

    .line 1828
    .line 1829
    if-nez v14, :cond_5c

    .line 1830
    .line 1831
    move-object v15, v2

    .line 1832
    goto :goto_52

    .line 1833
    :cond_5c
    invoke-static {v15, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1834
    .line 1835
    .line 1836
    move-result v2

    .line 1837
    xor-int/2addr v2, v4

    .line 1838
    or-int/2addr v2, v13

    .line 1839
    move v13, v2

    .line 1840
    :goto_52
    iget-object v2, v5, LA0/y;->e:Ljava/lang/Object;

    .line 1841
    .line 1842
    check-cast v2, [[[I

    .line 1843
    .line 1844
    aget-object v2, v2, v6

    .line 1845
    .line 1846
    aget-object v2, v2, v10

    .line 1847
    .line 1848
    aget v2, v2, v12

    .line 1849
    .line 1850
    and-int/lit8 v2, v2, 0x18

    .line 1851
    .line 1852
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    .line 1853
    .line 1854
    .line 1855
    move-result v3

    .line 1856
    const/4 v2, 0x1

    .line 1857
    add-int/2addr v12, v2

    .line 1858
    move-object/from16 v4, v19

    .line 1859
    .line 1860
    move/from16 v14, v20

    .line 1861
    .line 1862
    goto :goto_51

    .line 1863
    :cond_5d
    if-eqz v13, :cond_5e

    .line 1864
    .line 1865
    iget-object v2, v5, LA0/y;->c:Ljava/lang/Object;

    .line 1866
    .line 1867
    check-cast v2, [I

    .line 1868
    .line 1869
    aget v2, v2, v6

    .line 1870
    .line 1871
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    .line 1872
    .line 1873
    .line 1874
    move-result v3

    .line 1875
    :cond_5e
    if-eqz v3, :cond_5f

    .line 1876
    .line 1877
    const/4 v2, 0x1

    .line 1878
    goto :goto_53

    .line 1879
    :cond_5f
    const/4 v2, 0x0

    .line 1880
    :goto_53
    iget v3, v11, La0/V;->a:I

    .line 1881
    .line 1882
    new-array v4, v3, [I

    .line 1883
    .line 1884
    new-array v3, v3, [Z

    .line 1885
    .line 1886
    const/4 v12, 0x0

    .line 1887
    :goto_54
    iget v13, v11, La0/V;->a:I

    .line 1888
    .line 1889
    if-ge v12, v13, :cond_63

    .line 1890
    .line 1891
    iget-object v13, v5, LA0/y;->e:Ljava/lang/Object;

    .line 1892
    .line 1893
    check-cast v13, [[[I

    .line 1894
    .line 1895
    aget-object v13, v13, v6

    .line 1896
    .line 1897
    aget-object v13, v13, v10

    .line 1898
    .line 1899
    aget v13, v13, v12

    .line 1900
    .line 1901
    and-int/lit8 v13, v13, 0x7

    .line 1902
    .line 1903
    aput v13, v4, v12

    .line 1904
    .line 1905
    const/4 v13, 0x0

    .line 1906
    :goto_55
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 1907
    .line 1908
    .line 1909
    move-result v14

    .line 1910
    if-ge v13, v14, :cond_62

    .line 1911
    .line 1912
    invoke-interface {v9, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1913
    .line 1914
    .line 1915
    move-result-object v14

    .line 1916
    check-cast v14, LA0/w;

    .line 1917
    .line 1918
    invoke-interface {v14}, LA0/w;->b()La0/V;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v15

    .line 1922
    invoke-virtual {v15, v11}, La0/V;->equals(Ljava/lang/Object;)Z

    .line 1923
    .line 1924
    .line 1925
    move-result v15

    .line 1926
    if-eqz v15, :cond_61

    .line 1927
    .line 1928
    invoke-interface {v14, v12}, LA0/w;->t(I)I

    .line 1929
    .line 1930
    .line 1931
    move-result v14

    .line 1932
    const/4 v15, -0x1

    .line 1933
    if-eq v14, v15, :cond_60

    .line 1934
    .line 1935
    const/4 v14, 0x1

    .line 1936
    const/16 v22, 0x1

    .line 1937
    .line 1938
    goto :goto_58

    .line 1939
    :cond_60
    :goto_56
    const/4 v14, 0x1

    .line 1940
    goto :goto_57

    .line 1941
    :cond_61
    const/4 v15, -0x1

    .line 1942
    goto :goto_56

    .line 1943
    :goto_57
    add-int/2addr v13, v14

    .line 1944
    goto :goto_55

    .line 1945
    :cond_62
    const/4 v14, 0x1

    .line 1946
    const/4 v15, -0x1

    .line 1947
    const/16 v22, 0x0

    .line 1948
    .line 1949
    :goto_58
    aput-boolean v22, v3, v12

    .line 1950
    .line 1951
    add-int/2addr v12, v14

    .line 1952
    goto :goto_54

    .line 1953
    :cond_63
    const/4 v14, 0x1

    .line 1954
    const/4 v15, -0x1

    .line 1955
    new-instance v12, La0/a0;

    .line 1956
    .line 1957
    invoke-direct {v12, v11, v2, v4, v3}, La0/a0;-><init>(La0/V;Z[I[Z)V

    .line 1958
    .line 1959
    .line 1960
    invoke-virtual {v1, v12}, Lm2/C;->a(Ljava/lang/Object;)V

    .line 1961
    .line 1962
    .line 1963
    add-int/2addr v10, v14

    .line 1964
    move-object/from16 v2, v18

    .line 1965
    .line 1966
    const/4 v4, -0x2

    .line 1967
    goto/16 :goto_4e

    .line 1968
    .line 1969
    :cond_64
    move-object/from16 v18, v2

    .line 1970
    .line 1971
    const/4 v14, 0x1

    .line 1972
    const/4 v15, -0x1

    .line 1973
    add-int/2addr v6, v14

    .line 1974
    const/4 v4, -0x2

    .line 1975
    goto/16 :goto_4d

    .line 1976
    .line 1977
    :cond_65
    const/4 v6, 0x0

    .line 1978
    :goto_59
    iget-object v2, v5, LA0/y;->f:Ljava/lang/Object;

    .line 1979
    .line 1980
    check-cast v2, Lx0/q0;

    .line 1981
    .line 1982
    iget v3, v2, Lx0/q0;->a:I

    .line 1983
    .line 1984
    if-ge v6, v3, :cond_66

    .line 1985
    .line 1986
    invoke-virtual {v2, v6}, Lx0/q0;->a(I)La0/V;

    .line 1987
    .line 1988
    .line 1989
    move-result-object v2

    .line 1990
    iget v3, v2, La0/V;->a:I

    .line 1991
    .line 1992
    new-array v3, v3, [I

    .line 1993
    .line 1994
    const/4 v4, 0x0

    .line 1995
    invoke-static {v3, v4}, Ljava/util/Arrays;->fill([II)V

    .line 1996
    .line 1997
    .line 1998
    iget v7, v2, La0/V;->a:I

    .line 1999
    .line 2000
    new-array v7, v7, [Z

    .line 2001
    .line 2002
    new-instance v8, La0/a0;

    .line 2003
    .line 2004
    invoke-direct {v8, v2, v4, v3, v7}, La0/a0;-><init>(La0/V;Z[I[Z)V

    .line 2005
    .line 2006
    .line 2007
    invoke-virtual {v1, v8}, Lm2/C;->a(Ljava/lang/Object;)V

    .line 2008
    .line 2009
    .line 2010
    const/4 v2, 0x1

    .line 2011
    add-int/2addr v6, v2

    .line 2012
    goto :goto_59

    .line 2013
    :cond_66
    const/4 v4, 0x0

    .line 2014
    new-instance v2, La0/b0;

    .line 2015
    .line 2016
    invoke-virtual {v1}, Lm2/F;->g()Lm2/b0;

    .line 2017
    .line 2018
    .line 2019
    move-result-object v1

    .line 2020
    invoke-direct {v2, v1}, La0/b0;-><init>(Lm2/I;)V

    .line 2021
    .line 2022
    .line 2023
    new-instance v1, LA0/A;

    .line 2024
    .line 2025
    iget-object v3, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 2026
    .line 2027
    check-cast v3, [Lh0/r0;

    .line 2028
    .line 2029
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 2030
    .line 2031
    check-cast v0, [LA0/w;

    .line 2032
    .line 2033
    invoke-direct {v1, v3, v0, v2, v5}, LA0/A;-><init>([Lh0/r0;[LA0/w;La0/b0;LA0/y;)V

    .line 2034
    .line 2035
    .line 2036
    move v6, v4

    .line 2037
    :goto_5a
    iget v0, v1, LA0/A;->a:I

    .line 2038
    .line 2039
    if-ge v6, v0, :cond_6b

    .line 2040
    .line 2041
    invoke-virtual {v1, v6}, LA0/A;->b(I)Z

    .line 2042
    .line 2043
    .line 2044
    move-result v0

    .line 2045
    if-eqz v0, :cond_69

    .line 2046
    .line 2047
    iget-object v0, v1, LA0/A;->c:[LA0/w;

    .line 2048
    .line 2049
    aget-object v0, v0, v6

    .line 2050
    .line 2051
    move-object/from16 v3, p0

    .line 2052
    .line 2053
    if-nez v0, :cond_68

    .line 2054
    .line 2055
    iget-object v0, v3, Lh0/V;->j:[Lh0/q0;

    .line 2056
    .line 2057
    aget-object v0, v0, v6

    .line 2058
    .line 2059
    invoke-interface {v0}, Lh0/q0;->getTrackType()I

    .line 2060
    .line 2061
    .line 2062
    move-result v0

    .line 2063
    const/4 v2, -0x2

    .line 2064
    if-ne v0, v2, :cond_67

    .line 2065
    .line 2066
    goto :goto_5b

    .line 2067
    :cond_67
    move v0, v4

    .line 2068
    goto :goto_5c

    .line 2069
    :cond_68
    const/4 v2, -0x2

    .line 2070
    :goto_5b
    const/4 v0, 0x1

    .line 2071
    :goto_5c
    invoke-static {v0}, Ld0/m;->h(Z)V

    .line 2072
    .line 2073
    .line 2074
    :goto_5d
    const/4 v0, 0x1

    .line 2075
    goto :goto_5f

    .line 2076
    :cond_69
    move-object/from16 v3, p0

    .line 2077
    .line 2078
    const/4 v2, -0x2

    .line 2079
    iget-object v0, v1, LA0/A;->c:[LA0/w;

    .line 2080
    .line 2081
    aget-object v0, v0, v6

    .line 2082
    .line 2083
    if-nez v0, :cond_6a

    .line 2084
    .line 2085
    const/4 v0, 0x1

    .line 2086
    goto :goto_5e

    .line 2087
    :cond_6a
    move v0, v4

    .line 2088
    :goto_5e
    invoke-static {v0}, Ld0/m;->h(Z)V

    .line 2089
    .line 2090
    .line 2091
    goto :goto_5d

    .line 2092
    :goto_5f
    add-int/2addr v6, v0

    .line 2093
    goto :goto_5a

    .line 2094
    :cond_6b
    move-object/from16 v3, p0

    .line 2095
    .line 2096
    iget-object v0, v1, LA0/A;->c:[LA0/w;

    .line 2097
    .line 2098
    array-length v2, v0

    .line 2099
    move v5, v4

    .line 2100
    :goto_60
    if-ge v5, v2, :cond_6d

    .line 2101
    .line 2102
    aget-object v4, v0, v5

    .line 2103
    .line 2104
    move/from16 v6, p1

    .line 2105
    .line 2106
    if-eqz v4, :cond_6c

    .line 2107
    .line 2108
    invoke-interface {v4, v6}, LA0/w;->j(F)V

    .line 2109
    .line 2110
    .line 2111
    move/from16 v7, p3

    .line 2112
    .line 2113
    invoke-interface {v4, v7}, LA0/w;->c(Z)V

    .line 2114
    .line 2115
    .line 2116
    :goto_61
    const/4 v4, 0x1

    .line 2117
    goto :goto_62

    .line 2118
    :cond_6c
    move/from16 v7, p3

    .line 2119
    .line 2120
    goto :goto_61

    .line 2121
    :goto_62
    add-int/2addr v5, v4

    .line 2122
    goto :goto_60

    .line 2123
    :cond_6d
    return-object v1

    .line 2124
    :goto_63
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 2125
    throw v0

    .line 2126
    :catchall_1
    move-exception v0

    .line 2127
    goto :goto_63
.end method

.method public final k()V
    .locals 6

    .line 1
    iget-object v0, p0, Lh0/V;->a:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lx0/d;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lh0/V;->g:Lh0/W;

    .line 8
    .line 9
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    iget-wide v4, v1, Lh0/W;->d:J

    .line 15
    .line 16
    cmp-long v1, v4, v2

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    const-wide/high16 v4, -0x8000000000000000L

    .line 21
    .line 22
    :cond_0
    check-cast v0, Lx0/d;

    .line 23
    .line 24
    const-wide/16 v1, 0x0

    .line 25
    .line 26
    iput-wide v1, v0, Lx0/d;->p:J

    .line 27
    .line 28
    iput-wide v4, v0, Lx0/d;->q:J

    .line 29
    .line 30
    :cond_1
    return-void
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
