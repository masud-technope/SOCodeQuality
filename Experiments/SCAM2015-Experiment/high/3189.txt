mEditText.addTextChangedListener(new TextWatcher()
    {

        public void afterTextChanged(Editable s)
        {

        }

        public void beforeTextChanged(CharSequence s, int start,int count, int after)
        {

        }

        public void onTextChanged(CharSequence s, int start,int before, int count)
        {

            ArrayList<HashMap<String, String>> arrayTemplist= new ArrayList<HashMap<String,String>>();
            String searchString =mEditText.getText().toString().trim();
            if(searchString.length()>0)
            {
                for (int i = 0; i < arraylist.size(); i++)
                {
                    String currentString =arraylist.get(i).get(ListOfContacts.NAME);
                    if (searchString.equalsIgnoreCase(currentString))
                    {
                        arrayTemplist.add(arraylist.get(i));
                    }
                }
                adapter = new ListViewAdapter(ListOfContacts.this, arrayTemplist);
                listview.setAdapter(adapter);
            }
            else
            {
                adapter = new ListViewAdapter(ListOfContacts.this, arraylist);
                listview.setAdapter(adapter);
            }
         }
        });