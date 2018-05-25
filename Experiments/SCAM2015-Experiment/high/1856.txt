$(document).bind('ajaxComplete', function(event, xhr, options) {
    var redirectHeader = xhr.getResponseHeader('YourHeader');
    if(xhr.readyState == 4 && redirectHeader != null) {
        window.location.href = redirectHeader;
    }
});