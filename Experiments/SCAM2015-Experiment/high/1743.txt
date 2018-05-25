0x021dd753: test   %eax,0x180100      ;   {poll}
  0x021dd759: cmp    $0x0,%ecx
  0x021dd75c: je     0x021dd748         ;*ifeq
                                        ; - Test$1::run@7 (line 13)
  0x021dd75e: cmp    $0x0,%edx
  0x021dd761: jne    0x021dd788         ;*ifne
                                        ; - Test$1::run@13 (line 17)
  0x021dd767: nop    
  0x021dd768: jmp    0x021dd7b8         ;   {no_reloc}
  0x021dd76d: xchg   %ax,%ax
  0x021dd770: jmp    0x021dd7d2         ; implicit exception: dispatches to 0x021dd7c2
  0x021dd775: nop                       ;*getstatic out
                                        ; - Test$1::run@16 (line 18)
  0x021dd776: cmp    (%ecx),%eax        ; implicit exception: dispatches to 0x021dd7dc
  0x021dd778: mov    $0x39239500,%edx   ;*invokevirtual println