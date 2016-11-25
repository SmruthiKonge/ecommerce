/**
 * 
 */

var cartApp = angular.module('cartApp',[]);

cartApp.controller('cartCtrl',function($scope,$http){
	
	$scope.refreshCart=function(cartId){
		$http.get('/FrontEnd/rest/cart/'+cartId).success(function (data){
		$scope.cart=data;	
			
		});
	};
	
	$scope.clearCart = function(){
		$http.delete('/FrontEnd/rest/cart/'+$scope.cartId).success($scope.refreshCart());
	};
	$scope.initCartId=function(cartId){
		/*$scope.cartId;*/
		$scope.refreshCart(cartId);
		
	};
	
	$scope.addToCart=function(id){
	$http.put('/FrontEnd/rest/cart/add/'+id).success(function (){
	alert("Product Successfully added to cart!")
	});
	};
	
	$scope.removeFromCart=function(id){
	$http.put('/FrontEnd/rest/cart/remove/'+id).success(function (data){
	$scope.refreshCart();	

				
	});
	
	};
	
	$scope.calGrandTotal=function(){
		var grandTotal=0;
		
		for(var i=0; i<$scope.cart.cartItems.length; i++){
			grandTotal+=$scope.cart.cartItems[i].totalPrice;
		}
		 return grandTotal;
	};
	
});