[Entry Point]
[Verified Entry Point]
[Constants]
  # {method} {0x0000000055060500} &apos;runPreIncrement&apos; &apos;()V&apos; in &apos;PrePostIncrement&apos;
  #           [sp+0x20]  (sp of caller)
  0x000000000286fd80: sub    $0x18,%rsp
  0x000000000286fd87: mov    %rbp,0x10(%rsp)    ;*synchronization entry
                                                ; - PrePostIncrement::runPreIncrement@-1 (line 28)

  0x000000000286fd8c: add    $0x10,%rsp
  0x000000000286fd90: pop    %rbp
  0x000000000286fd91: test   %eax,-0x243fd97(%rip)        # 0x0000000000430000
                                                ;   {poll_return}
  0x000000000286fd97: retq   
  0x000000000286fd98: hlt    
  0x000000000286fd99: hlt    
  0x000000000286fd9a: hlt    
  0x000000000286fd9b: hlt    
  0x000000000286fd9c: hlt    
  0x000000000286fd9d: hlt    
  0x000000000286fd9e: hlt    
  0x000000000286fd9f: hlt