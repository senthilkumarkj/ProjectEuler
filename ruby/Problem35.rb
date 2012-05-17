class Problem35

	@@primes = []
	@@non_primes = []

	def self.isPrime?(n)
		if(n<=1)
			return false
		elsif n == 2
			return true
		elsif @@primes.include?(n)
			return true
		elsif @@non_primes.include?(n)
			return false
		end
		i = 2
		isPrime = true
		sqrt = Math.sqrt(n).to_i
		while(i<=sqrt)
			isPrime = false if n % i == 0
			i = i + 1
		end
		if isPrime
			@@primes << n 
		else
			@@non_primes << n
		end
		isPrime
	end

	def self.isCircularPrime?(n)
		if isPrime?(n)
			n.to_s.split('').permutation.to_a.each{|x|
			  if(!isPrime?(x.join().to_i))
			  	return false
			  end
			}
			return true
		else
			return false
		end
	end

end

count = 1
i = 3
while i < 1000000
	count = count+1 if Problem35.isCircularPrime?(i)
	i = i + 2
	puts i if (i+1) % 10000 == 0
end
puts count