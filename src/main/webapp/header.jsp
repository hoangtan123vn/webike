<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="./css/header.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.9/jquery.validate.min.js" type="text/javascript"></script>
<script type="text/javascript" src="./json/header.json"></script>
<script type="text/javascript">
	        /*  var jqxhr = $.getJSON( "./json/header.json", function() {
	  console.log( "success" );
	})
	  .done(function(data) {
		console.log(data);
		var topnav_menu = "";
		var categories ="";
		var sub_categories ="";
		var ul = "";
	  	$.each(data.headers,function(i,item){
	  		topnav_menu += "<li><a class='" + this.image + "' href=" + this.url + ">" + " " + this.title + "</a></li>";
	  	})
	  	$.each(data.categories,function(i,item){
	  		categories += "<li><a>" + this.title + 
	  		"<ul class='submenu' id='submenu2'>"; 
	  		$.each(this.submenu,function(j,item2){
	  			categories += "<li><a href=" +this.url+">" + this.name  +
	  			"<ul class='sub-sub-menu'>";
	  			 $.each(this.sub_name,function(k,item3){
	  				categories += "<li><a href=" +this.url+">"+ this.name + "</a></li>";
	  			 }) 
	  			"</a></li>";
	  			categories += "</ul>";
	  		})
	  		"</a></li>";
	  		categories += "</ul>";
	  	})
	  	$("#topnav-menu").html(topnav_menu);
		$("#submenu").html(categories);
		//$("#submenu").html(sub_categories);
	  })
	  .fail(function() {
	    console.log( "error" );
	  })
	  .always(function() {
	    console.log( "complete" );
	  });      */
	  
	    /*     function LoadHeader(){
		  $.ajax({
			  type : "GET",
			  url : "test.action",
			  success: function(result){
				  console.log(topnav_menu);
				  var categories ="";
				  var topnav_menu = "";
				  $.each(result.headers,function(j,item){
					  topnav_menu += "<li><a href=" + this.url + ">" + " " + this.name + "</a></li>";
				  })
				  console.log(result);
				  $.each(result.menus,function(i,item){
					  categories += "<li><a>" + this.title + 
					  "<ul class='submenu'>";
 					  $.each(this.categories,function(j,item2){
 						 categories += "<li><a href=" +this.url+">"+ this.title + 
 						"<ul class='sub-sub-menu'>";
 						$.each(this.sub_categories,function(k,item3){
 			  				categories += "<li><a href=" +this.url+">"+ this.name + "</a></li>";
 			  			 }) 
	  					 categories += "</ul>";
	  					 categories += "</a></li>";
					  })
					  "</a></li>";
 					  categories += "</ul>"
				  })
				  $("#submenu").html(categories);
				  $("#topnav-menu").html(topnav_menu);
			  },
			  error: function(result){
				  console.log(result);
			  }
		  })
	  }    */
	 
	

</script>
<meta charset="UTF-8">
<title>hehee</title>
</head>

<body onload="LoadHeader()">
     
      <%-- <s:bean name="action.HeaderAction" var="header" >
	  	  <s:param name="headers" value="headers"></s:param>
	  	  <s:param name="menus" value="menus"></s:param>
	 </s:bean>
	 
	  <s:iterator value="#header">
     	 <li><s:property value="#header.headers"/></li>
     	 <li><s:iterator value="#header.headers">
     	 	<a><s:property value="#header.headers.name"></s:property></a>
     	 </s:iterator></li>
     </s:iterator>  --%>
     
      <%-- <s:iterator value="headers">
     	 <li><s:property /></li>
     </s:iterator>  --%> 
	 
	 

	<div class ="header"> 
		<div class="topnav">
			<div class="container">
				<div class="topnav-left">
				
					<ul class="topnav-menu" id="topnav-menu">
					
					
				      <s:iterator value="headers" var="header">
						<li><a class="<s:property value="#header.image"/>" href="<s:property value="#header.url"/>"> <s:property value="#header.name" /></a></li>
						<!--  <li><a class="fa fa-shopping-cart" aria-hidden="true"> Shopping</a></li>
						<li><a class="fa fa-globe" aria-hidden="true"> News</a></li>
						<li><a class="fa fa-book" aria-hidden="true"> Magazine</a></li>
						<li><a class="fa fa-tags" aria-hidden="true"> Special Deal</a></li>
						<li><a class="fa fa-thumbs-up" aria-hidden="true"> Reviews</a></li>
						<li><a class="fa fa-archive" aria-hidden="true"> Wholesale</a></li>
						<li><a>FIM EWC</a></li>  -->
					</s:iterator>    
					
					
					
					
					<%-- <s:iterator value="#header.headers" var="property">
						<li><a class="<s:property value="#property.image"/>" href="<s:property value="#property.image"/>"> <s:property value="#property.image" /></a></li>
					</s:iterator> --%>
					
					
					
					
					
					
					</ul>
					
					
				
					
					
					
					<div class="icon-social">
						<a class="fa fa-twitter"></a>
						<a class="fa fa-facebook"></a>
					</div>
				
				</div>
				
				
				<div class="topnav-right">
					<ul class="topnav-login">
						<li><a class="fa fa-paypal" aria-hidden="true" class="border"> 0 pts.</a></li>
						<li><a class="fa fa-user" aria-hidden="true" class="border" > New Motorcycle Rider</a></li>
						<li><a class="fa fa-globe" aria-hidden="true" class="border"> Country/Region</a></li>
						<li><a class="border"> Languague:English</a></li>
					</ul>
						
				</div>
			
			</div>
		</div>
		
		<div class="banner">
			<div class="container1">
				<div class="banner_left">
					<div class="banner_image">
						<img class="img" src="https://st-img.webike-cdn.net/gcm/net/banner/logo.png" width="187" height="39"  aspect-ratio="auto 187 / 39"></img>
					</div>
					
		
					<div class="banner_search">
						<form class="search_form">
							<input class="search" placeholder="Enter Keyword"/>
							<select name="search_categories" id="search_categories">
    							<option value="All">All</option>
    							<option value="motocycle_part">Motocycle Part</option>
    							<option value="motocycle_gear">Motocycle Gear</option>
    							<option value="oem_part">OEM Parts</option>
    							<option value="helmet">Helmets</option>
    							<option value="accessories">Accessories</option>
    							<option value="tools">Tools</option>
  							</select>
  							<button type="submit" class="button_search">SEARCH</button>
						</form>
					</div>
					
					
					<div class="rito">
							<div class="rito_left">
								<div class="currency">
									<ul>
										<li><a class="inner" aria-hidden="true">USD</a></li>
										<li><a class="inner"  aria-hidden="true">SAU</a></li>
									
									</ul>
								
								</div>
								
							</div>
							
							<div class="rito_right">
								<div class="button_account">
									<img class="icon_account" src="./images/cart.png"></img>
								</div>
								
								<div class="button_account">
					
									<img class="icon_account" src="./images/motobike.png"></img>
								</div>
								
								<div class="button_account">
									<img class="icon_account" src="./images/star.png"></img>
								</div>
								
								
								<div class="button_account">
									<img class="icon_account" src="./images/help.png"></img>
								</div>
							
							</div>
					</div>
				</div>
			</div>
		
		
		</div>
		
		<div class="header_menu">
			<div class="menu">
				<div class="menu-left">
					<ul class="menu-categories-left" id="submenu">
					
					<!-- for trong struts 2 -->
					<%-- <s:iterator value="menus" var="menu">
					</s:iterator> --%>
					
					
					
					  <s:iterator value="menus" var="menu">
						<li><a><s:property value="#menu.title" /></a>
							<ul class='submenu'>
								<s:iterator value="categories" var="category">
									<li><a><s:property value="title"/></a>
									<s:if test="#category.sub_categories != null">
										<ul class='sub-sub-menu'>
											<s:iterator value="sub_categories">
												<li><a><s:property value="name"/></a>
											</s:iterator>
										</ul>
									</s:if>
										
									</li>
								</s:iterator>
							</ul>
						</li>
					</s:iterator> 
					
					
					
						<!--   <li><a>Moto</a>
							<ul class="submenu" id="submenu2">
								<li><a href="#">Sub Item1</a></li>
								<li><a href="#">Sub Item2</a>
									<ul class="sub-sub-menu">
                       				 <li><a href="#">Sub Sub Item 123</a>
                           			 <li><a href="#">Sub Sub Item 2</a>
                 				   </ul>
								</li>
								<li><a href="#">Sub Item3</a>
								   <ul class="sub-sub-menu">
                       				 <li><a href="#">Sub Sub Item 1</a>
                           			 <li><a href="#">Sub Sub Item 2</a>
                 				   </ul>
								</li>
									
							</ul>
						</li>
							
						<li><a>Brand</a></li>
						<li><a>OEM Parts</a></li>
						<li><a>Motocycle Parts</a></li>
						<li><a>Motocycle Gear</a></li>
						<li><a>Helmets</a></li>
						<li><a>Accessories</a></li>
						<li><a>Tools</a></li>  -->
					</ul>
				</div>
				
				<div class="menu-right">
					<ul class="menu-categories-right">
						<li><a>USER'S BIKE</a></li>
						<li><a>REVIEWS</a></li>
					</ul>
				</div>
			
			
			</div>
		
		
		</div>
	
	
	</div>
</body>
</html>