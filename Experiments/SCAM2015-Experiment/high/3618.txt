Map<String, String> tmpMap = new HashMap<String, String>();
                // initialize the map contents by loading some data from the database.
                // possible for the map to be empty after this.
                someMap = tmpMap;
            }
        }
    }
    return someMap.get(key);