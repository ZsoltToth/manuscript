angular.module('webApp')
.controller('registrationController', ['$scope', '$http', function($scope, $http){
	$scope.error = "";
	$scope.user = {
			firstName : "firs  tname",
			lastName : "lastname",
			userName: "username",
			password: "Passwo123!rd",
			birthDate: "2013-05-12",
			personalDescription: "personalDescription",
			email: "email@gmail.com",
			phoneNumber: "+3630/1234567",
			address: {
				street: "street",
//				city: "city",
				postalCode: "1234",
				country: "country"
			}
	}
    $scope.addNewUser = function(data, status, headers, config){
    	
    	
        $http.post('registration/create', JSON.stringify($scope.user)).success(function(data, status, headers, config){
            console.log('SUCCES DATA: ',data);
            $scope.error = data.messages;
        }).error(function(data, status, headers, config){
            console.log('ERROR: ',data, status, headers, config)
        });
    };
}])