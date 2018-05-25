[HttpPost]
    public JsonResult YourMethod(string o)
    {
      var saveObject = Newtonsoft.Json.JsonConvert.DeserializeObject<DestinationClass>(o);
     }