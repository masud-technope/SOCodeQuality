@Override
public String getTitle()
{
    Foo f = new Foo();

    Button b = getButtonReference();
    b.setOnClickListener(new OnClickListener()
    {
        public void onClick(View v)
        {  
            Boo o = f.someMethod();
        }
    });

    f = null;
}