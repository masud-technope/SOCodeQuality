$(document).ready(function () {

    var id = '${id}' // you can have it here
    $('.doAction').click(function () {
        var rel = $('.doAction:checked').attr('rel'); // you need not parse to int because it will always string in parameter
        $('.doAction').prop('disabled', true); // to disable radio button
        $.ajax({
            type: 'POST',
            dataType: 'html', // change this since your servlet response is html not json
            cache: false,
            data: {
                rating: rel,
                itemID: id
            },
            url: 'Ratings',
            success: function (data) {
                   $('#rating').html(data); // assuming response as {"rating" : 4.4} 
            }
        });
    });
});