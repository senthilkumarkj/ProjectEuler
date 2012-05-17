class Problem35

	@@primes = []

	def self.prime?(n)
		if(n<=1)
			return false
		elsif n == 2
			return true
		elsif @@primes.include?(n)
			return true
		end
		i = 2
		isPrime = true
		sqrt = Math.sqrt(n).to_i
		while(i<=sqrt)
			isPrime = false if n % i == 0
			i = i + 1
		end
		@@primes << n if isPrime
		isPrime
	end

	def self.circularPrime?(n)
		n_digits = n.to_s.split('')
		if (['0','2','4','6','8'] & n_digits).empty? && prime?(n)
			for i in 1..n_digits.length-1
				if(!prime?(n_digits.push(n_digits.shift).join.to_i))
					return false
				end
			end
			return true
		else
			return false
		end
	end

end

count = 1
i = 3

while i < 1000000
	count = count+1 if Problem35.circularPrime?(i)
	puts i if (i+1) % 10000 == 0
	i = i + 2
end

puts count