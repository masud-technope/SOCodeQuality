JSONArray obj = new JSONArray(v);
            ArrayList<String> list = new ArrayList<String>();

            for(int i = 0 ; i < obj.length(); i++){
                Logger.WriteOutput(obj.getJSONObject(i).getString(c), Logger.LogLevel.Info);
            }