@RequestMapping("/userGrid", 
params = {"_search", "nd", "rows", "page", "sidx", "sort"})
public @ResponseBody GridModel getUsersForGrid(
@RequestParam(value = "_search") String search, 
@RequestParam(value = "nd") int nd, 
@RequestParam(value = "rows") int rows, 
@RequestParam(value = "page") int page, 
@RequestParam(value = "sidx") int sidx, 
@RequestParam(value = "sort") Sort sort) {
// Stuff here
}