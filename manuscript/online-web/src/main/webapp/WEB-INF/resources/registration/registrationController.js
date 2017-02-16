app.controller('registrationController', ['$scope', '$http', '$location', 'preload',
	function ($scope, $http, $location, preload) {
		$scope.registration = {
			"user": {},
			"password": {},
			"academicDisciplines": []
		};
		$scope.preload = preload.data.academicDisciplines;

		$scope.addItem = function (item) {
			if ($scope.registration.academicDisciplines.indexOf(item) !== -1 || $scope.preload.indexOf(item) == -1) {
				console.log("error message")
			} else {
				$scope.registration.academicDisciplines.push(item);
				$scope.academicDisciplines = null;
			}
		}
		$scope.removeItem = function (index) {
			$scope.registration.academicDisciplines.splice(index, 1);
		}

		$scope.registrationCreate = function () {
			$http.post('registration/create', $scope.registration).then(function (response) {
				$scope.registrationResponse = response.data;
				$scope.checkRegistrationSucces();
			})
		}

		$scope.checkRegistrationSucces = function () {
			console.log("registrationResponse: ", $scope.registrationResponse);
			if ($scope.registrationResponse.success != undefined && $scope.registrationResponse.success == true) {
				$location.path('/');
			}
		}
	}]);