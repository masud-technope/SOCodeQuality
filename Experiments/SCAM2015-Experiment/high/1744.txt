0x0226d763: test   %eax,0x180100      ;   {poll}
  0x0226d769: cmp    $0x0,%edx
  0x0226d76c: je     0x0226d758         ;*ifeq
                                        ; - Test$1::run@7 (line 13)
  0x0226d76e: mov    $0x341b77f8,%edx   ;   {oop('Test')}
  0x0226d773: mov    0x154(%edx),%edx   ;*getstatic b
                                        ; - Test::access$0@0 (line 3)
                                        ; - Test$1::run@10 (line 17)
  0x0226d779: cmp    $0x0,%edx
  0x0226d77c: jne    0x0226d7a8         ;*ifne
                                        ; - Test$1::run@13 (line 17)
  0x0226d782: nopw   0x0(%eax,%eax,1)
  0x0226d788: jmp    0x0226d7ed         ;   {no_reloc}
  0x0226d78d: xchg   %ax,%ax
  0x0226d790: jmp    0x0226d807         ; implicit exception: dispatches to 0x0226d7f7
  0x0226d795: nop                       ;*getstatic out
                                        ; - Test$1::run@16 (line 18)
  0x0226d796: cmp    (%ecx),%eax        ; implicit exception: dispatches to 0x0226d811
  0x0226d798: mov    $0x39239500,%edx   ;*invokevirtual println