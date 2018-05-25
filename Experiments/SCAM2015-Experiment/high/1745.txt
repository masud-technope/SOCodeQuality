0x0226d76e: mov    $0x341b77f8,%edx   ;   {oop('Test')}
  0x0226d773: mov    0x154(%edx),%edx   ;*getstatic b
                                        ; - Test::access$0@0 (line 3)
                                        ; - Test$1::run@10 (line 17)
  0x0226d779: cmp    $0x0,%edx
  0x0226d77c: jne    0x0226d7a8         ;*ifne
                                        ; - Test$1::run@13 (line 17)