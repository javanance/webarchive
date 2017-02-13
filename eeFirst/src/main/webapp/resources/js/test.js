/**
 * 
 */
function getItems(name){
	alert(name)
}


function getItem(){
	alert("aaaaa")
}

function scrollToTop1() {
    try {
//       PrimeFaces.scrollTo($('.ui-datatable').attr('id'));
       PrimeFaces.scrollTo($('formDynamicModel:aaa'));
       alert("bbb")
    } catch(err) {
      //No Message was found!
    	alert("aaaaa")
    }
 }


function scrollToTop(){
	$('formDynamicModel:aaa').animate({scrollTop:0});
//	window.scrollTo(0, 0);
//    $("html, body").animate({scrollTop: 0}, 600);
	alert("aaaaa");
    return false;
}

function handleResponse(xhr,status,args) {
	$('formDynamicModel:aaa').animate({scrollTop:0});
	
//    if (args.validationFailed) {
//    }
	
//	alert("aaaaa")
  }

function aaa(){
	var noOfItems = $("#fm\\:hiddenSizeId").val();
	var itemIx = $("#fm\\:hiddenIxId").val();
	var bucketHt = $("#fm\\:table .ui-datatable-scrollable-body").height();
	var scrollHt = $("#fm\\:table .ui-datatable-scrollable-body").prop("scrollHeight");
		
	var itemHt = parseInt(scrollHt) / parseInt(noOfItems);
	var noItemsInBucket = parseInt(bucketHt) / parseFloat(itemHt);

	var itemNo = parseInt(itemIx) + 1;
	var targetBucket = parseInt(itemNo) / parseFloat(noItemsInBucket);
	var halfBucketHt = parseInt(bucketHt) / 2;
	
	var scrollPos = 
		(parseInt(bucketHt) * (parseFloat(targetBucket) - 1)) + parseFloat(halfBucketHt);
	var scrollPosInt = Math.round(parseFloat(scrollPos));
	
	$('#fm\\:table .ui-datatable-scrollable-body').animate({scrollTop:scrollPosInt});
}