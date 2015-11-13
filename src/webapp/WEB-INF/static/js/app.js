/**
 * 
 */
'use strict';
 var app= angular.module('AngularSpringmvcMybatis',[]);
 
// app.config(['$routerProvider',function($routerProvider){
// 	$routeProvider.when('/users',{
// 		templateUrl: 'users/layout',
// 		controller: UserController
// 	});
// 	 $routeProvider.otherwise({redirectTo: '/users'});
// }]);

app.controller('UserController',function($scope,$http){
	$scope.fetchUsersList = function() {
        $http.get('users/userList').success(function(userList){
            $scope.users = userList;
        });
    };

    $scope.addNewUser = function(newUser) {
        $http.post('users/addUser/' + newUser).success(function() {
            $scope.fetchUsersList();
        });
        $scope.userName = '';
    };

    $scope.removeUser = function(user) {
        $http.post('users/removeUser/' + user.username).success(function() {
            $scope.fetchUsersList();
        });
    };

    $scope.removeAllUsers = function() {
        $http.post('users/removeAllUser').success(function() {
            $scope.fetchUsersList();
        });

    };

    $scope.fetchUsersList();
});

