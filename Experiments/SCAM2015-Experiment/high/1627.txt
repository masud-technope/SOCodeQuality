checkbox = new AwtCheckbox();
...
checkbox->CreateHWnd(env, labelStr, style, exStyle,
         x, y, width, height,
         awtParent->GetHWnd(),
         reinterpret_cast<HMENU>(static_cast<INT_PTR>(
     awtParent->CreateControlID())),
         ::GetSysColor(COLOR_WINDOWTEXT),
         ::GetSysColor(COLOR_BTNFACE),
         peer);