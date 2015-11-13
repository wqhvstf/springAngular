 'use strict';
/**
 * 
 */ 
 appControllers.controller('UserController',['$scope','$http',function($scope,$http){
 	$scope.fetchUsersList = function() {
        $http.get('users/userlist.json').success(function(userList){
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
        $http.post('users/removeUser/' + user).success(function() {
            $scope.fetchUsersList();
        });
    };

    $scope.removeAllUsers = function() {
        $http.post('users/removeAllUser').success(function() {
            $scope.fetchUsersList();
        });

    };

    $scope.fetchUsersList();
 }]);

