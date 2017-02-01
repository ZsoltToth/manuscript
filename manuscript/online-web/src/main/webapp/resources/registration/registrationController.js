App.controller('registrationController', [ '$scope', 'preload', '$http', '$location',
		function($scope, preload, $http, $location) {
			$scope.registration = {
				"user" : {},
				"password" : {},
				"academicDisciplines" : []
			};
			$scope.preload = preload.data.academicDisciplines;

			$scope.addItem = function(item) {
				if ($scope.registration.academicDisciplines.indexOf(item) !== -1 || $scope.preload.indexOf(item) == -1) {
					console.log("error message")
				}else{
				$scope.registration.academicDisciplines.push(item);
				$scope.academicDisciplines = null;
				}
			}
			$scope.removeItem = function(index) {
				$scope.registration.academicDisciplines.splice(index, 1);
			}
			
			$scope.registrationCreate = function(){
				$http.post('registration/create', $scope.registration).then(function(response) {
					console.log(response);
					$scope.registrationResponse = response.data;
					$scope.checkRegistrationSucces();
				})
			}
			
			$scope.checkRegistrationSucces = function(){
				console.log("registrationResponse: ", $scope.registrationResponse);
				if ( $scope.registrationResponse.isSucces != undefined &&  $scope.registrationResponse.isSucces == true) {
					$location.path('/login');
				}
			}
			
		} ]);