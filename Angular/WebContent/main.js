var myapp=angular.module('myapp',['ngRoute']);

myapp.config(function($routeProvider){
	$routeProvider
	.when('/',{
		templateUrl: 'home.html',
		controller: 'ramanController'
	})
	.when('/aboutus',{
		templateUrl: 'aboutus.html',
		controller: 'aboutusController'
	})
	.when('/news',{
		templateUrl: 'news.html',
		controller: 'newsController'
	});
});
	myapp.controller('ramanController',function($scope){
		$scope.message="Home page";
	})
	
	myapp.controller('aboutusController',function($scope){
		$scope.message="aboutus.html";
	})
	
	myapp.controller('newsController',function($scope){
		$scope.message="News page";
	});
	
	
