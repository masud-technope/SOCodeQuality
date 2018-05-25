/*                          int x = 3;                           */
iconst_3 // push the constant 3 on to the stack         : temp = 3
istore_0 // pop the stack and store in local variable 0 : x = temp
/*                          x = x++;                             */
iload_0  // push local variable 0 on to the stack       : temp = x
iinc 0 1 // increment local variable 0 by 1             : x = x + 1
istore_0 // pop the stack and store in local variable 0 : x = temp