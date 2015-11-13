/**
 * 
 */
 
 var app= angular.module('AngularSpringmvcMybatis',['AngularSpringmvcMybatis.controllers']);
 
 app.config(['$routerProvider',function($routerProvider){
 	$routeProvider.when('/users',{
 		templateUrl: 'users/layout',
 		controller: UserController
 	});
 	 $routeProvider.otherwise({redirectTo: '/users'});
 }]);