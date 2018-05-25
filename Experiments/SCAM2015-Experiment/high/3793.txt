[Entry Point]
[Verified Entry Point]
[Constants]
  # {method} {0x00000000550605b8} &apos;runPostIncrement&apos; &apos;()V&apos; in &apos;PrePostIncrement&apos;
  #           [sp+0x20]  (sp of caller)
  0x000000000286d0c0: sub    $0x18,%rsp
  0x000000000286d0c7: mov    %rbp,0x10(%rsp)    ;*synchronization entry
                                                ; - PrePostIncrement::runPostIncrement@-1 (line 35)

  0x000000000286d0cc: mov    $0x1,%r11d
  0x000000000286d0d2: jmp    0x000000000286d0e3
  0x000000000286d0d4: nopl   0x0(%rax,%rax,1)
  0x000000000286d0dc: data32 data32 xchg %ax,%ax
  0x000000000286d0e0: inc    %r11d              ; OopMap{off=35}
                                                ;*goto
                                                ; - PrePostIncrement::runPostIncrement@11 (line 36)

  0x000000000286d0e3: test   %eax,-0x243d0e9(%rip)        # 0x0000000000430000
                                                ;*goto
                                                ; - PrePostIncrement::runPostIncrement@11 (line 36)
                                                ;   {poll}
  0x000000000286d0e9: cmp    $0x7fffffff,%r11d
  0x000000000286d0f0: jl     0x000000000286d0e0  ;*if_icmpge
                                                ; - PrePostIncrement::runPostIncrement@8 (line 36)

  0x000000000286d0f2: add    $0x10,%rsp
  0x000000000286d0f6: pop    %rbp
  0x000000000286d0f7: test   %eax,-0x243d0fd(%rip)        # 0x0000000000430000
                                                ;   {poll_return}
  0x000000000286d0fd: retq   
  0x000000000286d0fe: hlt    
  0x000000000286d0ff: hlt