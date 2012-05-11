#!/usr/bin/ruby
sum = 0
max_sum = 0
for i in 2..99
	for j in 2..99
		sum = 0
		a_pow_b = i ** j
		a_pow_b.to_s.chars.each{|d| sum = sum + d.to_i}
		if sum > max_sum
			max_sum = sum
		end
	end
end

puts "max sum is "+max_sum.to_s