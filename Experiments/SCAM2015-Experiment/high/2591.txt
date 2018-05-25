for(DefinitionElement e : packageDefinitions) {
    if(e.doesImportPreparedStatement()) {
        importsPreparedStatement = true;
        break;
    }
}