/**
 * 
 */
 
 var AngularSpringmvcMybatis ={};
 
 var app= angular.module('AngularSpringmvcMybatis',['AngularSpringmvcMybatis.controllers','AngularSpringmvcMybatis.filters', 'AngularSpringmvcMybatis.services', 'AngularSpringmvcMybatis.directives']);
 
 app.config('$routerProvider',function($routerProvider){
 	$routeProvider.when('/users',{
 		templateUrl: 'users/layout',
 		controller: UserController
 	});
 	 $routeProvider.otherwise({redirectTo: '/users'});
 });