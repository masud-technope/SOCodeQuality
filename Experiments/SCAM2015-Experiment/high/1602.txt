public boolean clearSelection()
  {
    boolean flag = false;
    if (!this.m_SelectedComps.isEmpty())
    {
      flag = true;
      Iterator localIterator = this.m_SelectedComps.iterator();
      while (localIterator.hasNext())
        ((AnnotComponent)localIterator.next()).remove();
      this.m_SelectedComps.clear();
    }
    return flag;
  }